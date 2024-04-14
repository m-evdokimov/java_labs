package src.lab4;

import java.util.Random;
import java.util.Scanner;

class ZeroDimensionException extends Exception {
  public ZeroDimensionException(String msg) {
    super(msg);
  }
}

public class Task2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int rows = 0;
    int cols = 0;
    try {
      System.out.print("Количество строк: ");
      rows = scanner.nextInt();
      if (rows == 0) {
        throw new ZeroDimensionException("Количество строк матрицы должно быть положительным");
      }

      System.out.print("Количество столбцов: ");
      cols = scanner.nextInt();

      if (cols == 0) {
        throw new ZeroDimensionException("Количество столбцов матрицы должно быть положительным");
      }
    } catch (java.util.InputMismatchException e) {
      System.out.println("Ошибка: введено некорректное значение.");
      scanner.close();
      return;
    } catch (ZeroDimensionException e) {
      System.out.println(String.format("Ошибка: %s", e.getMessage()));
      scanner.close();
      return;
    }

    int[][] matrix = new int[rows][cols];
    System.out.println("Матрица:");
    Random random = new Random();
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = random.nextInt(5);
        System.out.print(matrix[i][j] + "\t");
      }
      System.out.println();
    }

    System.out.print("Введите индекс столбца: ");
    try {
      int col = scanner.nextInt();

      if (col < 0 || col >= cols) {
        System.out.println("Ошибка: Нет столбца с таким индексом");
      } else {
        System.out.println("Столбец с индексом " + col + ":");
        for (int i = 0; i < rows; i++) {
          System.out.println(matrix[i][col]);
        }
      }
    } catch (java.util.InputMismatchException e) {
      System.out.println("Ошибка: Введено некорректное значение. Введите целое число.");
    } finally {
      scanner.close();
    }
  }
}