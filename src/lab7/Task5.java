package src.lab7;

import java.io.File;
import java.util.Scanner;

public class Task5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите путь:");
    String path = scanner.nextLine();

    File file = new File(path);

    if (file.exists()) {
      long fileSizeInBytes = file.length();
      System.out.println("Размер файла " + path + ": " + fileSizeInBytes + " байт");
    } else {
      System.out.println("Файл не найден: " + path);
    }
    scanner.close();
  }
}