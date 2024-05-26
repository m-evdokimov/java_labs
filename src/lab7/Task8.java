package src.lab7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Struct implements Serializable {
  private String name;
  private int prop;

  public Struct(String name, int prop) {
    this.name = name;
    this.prop = prop;
  }

  public String getName() {
    return this.name;
  }
  public int getProp() {
    return this.prop;
  }
}

public class Task8 {
  public static void main(String[] args) {
    Struct obj = new Struct("Example", 7);

    String filename = "src/lab7/Struct.struct";

    try {
      FileOutputStream fileOut = new FileOutputStream(filename);
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(obj);
      out.close();
      fileOut.close();
      System.out.println("Записан в файл: " + filename);
    } catch (IOException e) {
      System.out.println("Ошибка при записи объекта в файл: " + e.getMessage());
    }

    Struct restoredStruct = null;
    try {
      FileInputStream fileIn = new FileInputStream(filename);
      ObjectInputStream in = new ObjectInputStream(fileIn);
      restoredStruct = (Struct) in.readObject();
      in.close();
      fileIn.close();
      System.out.println("Восстановлен из файла: " + filename);
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Ошибка при восстановлении объекта из файла: " + e.getMessage());
    }

    if (restoredStruct != null) {
      System.out.println("Значения полей:");
      System.out.println("name: " + restoredStruct.getName());
      System.out.println("prop: " + restoredStruct.getProp());
    }

    if (new File(filename).delete()) {
      System.out.println("Файл удален: " + filename);
    } else {
      System.out.println("Не удалось удалить файл: " + filename);
    }
  }
}
