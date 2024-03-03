package src.lab1;

import java.util.Scanner;

public class Example14 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Input number: ");
    int number = in.nextInt();

    int prev = number - 1;
    int next = number + 1;
    double square = Math.pow(prev + number + next, 2);

    System.out.println(
        String.format("%s %s %s %s", prev, number, next, square)
    );
    in.close();
  }
}
