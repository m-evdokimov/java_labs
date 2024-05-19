package src.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task6 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Количество строк: ");
    int n = in.nextInt();

    List<Integer> numbers = new ArrayList<Integer>();

    in.nextLine();

    for (int i = 0; i < n; i++) {
      numbers.add(in.nextInt());
    }

    System.out.println("\n" + "Делитель: " + "\n");
    Integer divisor = in.nextInt();

    in.close();

    System.out.println("\n" + "Числа: " + "\n");
    System.out.println(numbers.toString());

    List<Integer> filteredNumbers = filterDivisibleNumbers(numbers, divisor);
    System.out.println("\n" + "Числа после фильтрации: " + "\n");
    System.out.println(filteredNumbers.toString());
  }

  public static List<Integer> filterDivisibleNumbers(List<Integer> list, int divisor) {
    return list.stream()
        .filter(num -> num % divisor == 0)
        .collect(Collectors.toList());
  }
}