package src.lab2.Task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("N: ");

    int n = scanner.nextInt();
    scanner.close();

    int[] arr = new int[n];
    Random rng = new Random();
    for (int i = 0; i < n; i++) {
        arr[i] = rng.nextInt(10);
        System.out.print(arr[i] + ", ");
    }
    System.out.println("");

    int minVal = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] < minVal) {
            minVal = arr[i];
        }
    }

    System.out.println("Минимальное значение: " + minVal);
    System.out.println("Индексы: ");
    for (int i = 0; i < n; i++) {
        if (arr[i] == minVal) {
            System.out.println(i + " ");
        }
    }
  }
}