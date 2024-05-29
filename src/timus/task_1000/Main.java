package src.timus.task_1000;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    scanner.close();
    String[] nums = input.split(" ");

    int a = Integer.parseInt(nums[0]);
    int b = Integer.parseInt(nums[1]);

    System.out.print(a + b);
  }
}