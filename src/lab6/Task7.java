package src.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task7 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Количество строк: ");
    int n = in.nextInt();

    List<String> strings = new ArrayList<String>();

    in.nextLine();

    for (int i = 0; i < n; i++) {
      strings.add(in.nextLine());
    }

    System.out.println("\n" + "Введите минимальную длину: " + "\n");
    int minLength = in.nextInt();

    in.close();

    System.out.println("\n" + "Список строк до преобразования: " + "\n");
    for (String str : strings) {
      System.out.println(str);
    }

    List<String> filteredStrings = filterStringsByLength(strings, minLength);
    System.out.println("\n" + "Список строк после фильтрации: " + "\n");
    for (String str : filteredStrings) {
      System.out.println(str);
    }
  }

  public static List<String> filterStringsByLength(List<String> list, int minLength) {
    return list.stream()
        .filter(str -> str.length() > minLength)
        .collect(Collectors.toList());
  }
}