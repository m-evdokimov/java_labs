package src.lab1;

import java.util.Scanner;

public class Example15 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Input first number: ");
    int first_num = in.nextInt();

    System.out.println("Input second number: ");
    int second_num = in.nextInt();

    System.out.println(
        String.format("Sum: %s. Diff: %s", first_num + second_num, first_num - second_num)
    );
    in.close();
  }
}
