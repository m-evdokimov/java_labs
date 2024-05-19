package src.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task5 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Количество строк: ");
    int n = in.nextInt();

    List<String> strings = new ArrayList<String>();

    in.nextLine();
    for (int i = 0; i < n; i++) {
      strings.add(in.nextLine());
    }

    System.out.println("\n" + "Подстрока: " + "\n");
    String substr = in.nextLine();
    in.close();

    System.out.println("\n" + "Строки до преобразования: " + "\n");
    for (String str: strings) {
      System.out.println(str);
    }

    List<String> stringsAfter = filterContainsSubstring(strings, substr);
    System.out.println("\n" + "Список отфильтрованных строк: " + "\n");
    for (String str: stringsAfter) {
      System.out.println(str);
    }
  }

  public static List<String> filterContainsSubstring(List<String> list, String substr) {
    return list.stream()
        .filter(str -> str.contains(substr))
        .collect(Collectors.toList());
  }
}