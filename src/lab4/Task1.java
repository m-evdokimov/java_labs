package src.lab4;

import java.util.Scanner;

class NoPositiveNumbersException extends Exception {
  public NoPositiveNumbersException() {
    super("Положительные элементы отсутствуют");
  }
}

public class Task1 {
  public static double meanPositive(int[] array) throws NoPositiveNumbersException {
    int sum = 0;
    int n = 0;

    for (int num : array) {
      if (num > 0) {
        sum += num;
        n++;
      }
    }

    if (n == 0) {
      throw new NoPositiveNumbersException();
    }
    return (double) sum / n;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Введите размер массива: ");
      int size = scanner.nextInt();
      int[] arr = new int[size];

      System.out.println("Введите элементы массива:");
      for (int i = 0; i < size; i++) {
        arr[i] = scanner.nextInt();
      }

      double average = meanPositive(arr);
      System.out.println("Среднее значение положительных элементов массива: " + average);
    } catch (java.util.InputMismatchException e) {
      if (e.getMessage() == null) {
        System.out.println("Неправильный тип данных ввода");
      } else if (e.getMessage().contains("out of range")) {
        System.out.println("Введенное число выходит за пределы допустимого диапазона");
      } else if (e.getMessage().contains("does not match pattern")) {
        System.out.println("Введена строка вместо числа");
      } else {
        System.out.println(e.getMessage());
      }
    } catch (NegativeArraySizeException e) {
      System.out.println("Введен отрицательный размер массива");
    } catch (NoPositiveNumbersException e) {
      System.out.println(String.format("Ошибка: %s", e.getMessage()));
    }
    scanner.close();
  }
}