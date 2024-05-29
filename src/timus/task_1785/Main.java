package src.timus.task_1785;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    String loc = "";
    if (count >= 1 && count <= 4) {
      loc = "few";
    } else if (count >= 5 && count <= 9) {
      loc = "several";
    } else if (count >= 10 && count <= 19) {
      loc = "pack";
    } else if (count >= 20 && count <= 49) {
      loc = "lots";
    } else if (count >= 50 && count <= 99) {
      loc = "horde";
    } else if (count >= 100 && count <= 249) {
      loc = "throng";
    } else if (count >= 250 && count <= 499) {
      loc = "swarm";
    } else if (count >= 500 && count <= 999) {
      loc = "zounds";
    } else if (count >= 1000) {
      loc = "legion";
    } else {
      loc = "Invalid input";
    }
    System.out.print(loc);
    scanner.close();
  }
}