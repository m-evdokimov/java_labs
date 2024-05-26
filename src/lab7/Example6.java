package src.lab7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Example6 {
  public static void main(String[] args) {
    String inputFileName = "src/lab7/example6/input.txt";
    String outputFileName = "src/lab7/example6/output.txt";
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
        PrintWriter printWriter = new PrintWriter(outputFileName, "UTF-8")) {
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        printWriter.println(line.toUpperCase());
      }
      System.out.println("Данные записаны в файл: " + outputFileName);
    } catch (IOException e) {
      System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
    }
  }
}
