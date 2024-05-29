package src.timus.task_1264;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    scanner.close();
    System.out.print(N * (M + 1));
  }
}