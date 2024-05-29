package src.timus.task_1068;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.close();

    int sum = 0;
    if (N > 0) {
      for (int i = 1; i <= N; i++) {
        sum += i;
      }
    } else {
      for (int i = 1; i >= N; i--) {
        sum += i;
      }
    }

    System.out.print(sum);
  }
}