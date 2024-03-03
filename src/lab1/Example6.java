package src.lab1;

import java.util.Scanner;

public class Example6 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Input surname: ");
    String surname = in.nextLine();

    System.out.println("Input name: ");
    String name = in.nextLine();

    System.out.println("Input middle name: ");
    String mid_name = in.nextLine();

    String message = String.format("Hello, %s %s %s!", surname, name, mid_name);
    System.out.println(message);
    in.close();
  }
}
