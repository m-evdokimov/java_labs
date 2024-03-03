package src.lab1;

import java.util.Scanner;
import java.time.Year;

public class Example11 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Input name: ");
    String name = in.nextLine();

    System.out.println("Input birth year: ");
    int birth_year = in.nextInt();

    Year year = Year.now();
    int age = year.minusYears(birth_year).getValue();

    System.out.println(
        String.format("Name: %s, Age:  %s y.o.", name, age)
    );
    in.close();
  }
}
