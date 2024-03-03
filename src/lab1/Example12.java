package src.lab1;

import java.util.Scanner;
import java.time.Year;

public class Example12 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Input age: ");
    int age = in.nextInt();

    Year year = Year.now();
    int birth_year = year.minusYears(age).getValue();

    System.out.println(
        String.format("Birth year: %s", birth_year)
    );
    in.close();
  }
}
