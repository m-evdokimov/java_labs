package src.lab7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Task4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите путь: ");
    String path = scanner.nextLine();

    File srcFile = new File(path);
    if (!srcFile.exists() || !srcFile.isFile()) {
      System.out.println("Файл не существует");
      scanner.close();
      return;
    }

    System.out.println("Введите имя файла, в который нужно скопировать данные: ");
    String dstFile = scanner.nextLine();

    try (
        BufferedReader reader = new BufferedReader(new FileReader(srcFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(dstFile))) {
      writer.write("");

      String line;
      while ((line = reader.readLine()) != null) {
        writer.write(line);
      }
      System.out.println("Скопировано в файл: " + dstFile);
    } catch (IOException e) {
      System.out.println("Ошибка при копировании файла: " + e.getMessage());
    } finally {
      scanner.close();
    }
  }
}