package src.lab1;

import java.util.Scanner;

public class Example9 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Input month: ");
    String month = in.nextLine();

    System.out.println("Input days in month: ");
    int day_count = in.nextInt();

    String message = String.format("%s has %s days", month, day_count);
    System.out.println(message);
    in.close();
  }
}
