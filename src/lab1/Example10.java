package src.lab1;

import java.util.Scanner;
import java.time.Year;

public class Example10 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Input birth year: ");
    int birth_year = in.nextInt();

    Year curr_year = Year.now();
    int age = curr_year.minusYears(birth_year).getValue();

    String message = String.format("Age: %s", age);
    System.out.println(message);
    in.close();
  }
}
