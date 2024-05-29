package src.timus.task_1639;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    int n = scanner.nextInt();
    scanner.close();

    if ((m * n) % 2 == 0) {
      System.out.println("[:=[first]");
    } else {
      System.out.println("[second]=:]");
    }
  }
}