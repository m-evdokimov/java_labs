package src.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task8 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Количество чисел: ");
    int size = in.nextInt();

    List<Integer> numbers = new ArrayList<Integer>();

    in.nextLine();

    for (int i = 0; i < size; i++) {
      numbers.add(in.nextInt());
    }

    System.out.println("\n" + "Минимальное значение: " + "\n");
    Integer minInteger = in.nextInt();

    in.close();

    System.out.println("\n" + "Список чисел: " + "\n");
    System.out.println(numbers.toString());

    List<Integer> filteredNumbers = filterNumbersGreaterThan(numbers, minInteger);
    System.out
        .println("\n" + "Числа после фильтрации: " + "\n");
    System.out.println(filteredNumbers.toString());
  }

  public static List<Integer> filterNumbersGreaterThan(List<Integer> list, int threshold) {
    return list.stream()
        .filter(num -> num > threshold)
        .collect(Collectors.toList());
  }
}