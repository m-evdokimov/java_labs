package src.timus.task_1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    int A = in.nextInt();
    int B = in.nextInt();
    int C = A + B - 1;

    out.println((C - A) + " " + (C - B));
    out.flush();
    out.close();
    in.close();
  }
}
