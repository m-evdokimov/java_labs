package src.lab1;

import java.util.Scanner;

public class Example13 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Input first number: ");
    int first_num = in.nextInt();

    System.out.println("Input second number: ");
    int second_num = in.nextInt();

    int sum = first_num + second_num;
    System.out.println(
        String.format("Sum is %s", sum)
    );
    in.close();
  }
}
