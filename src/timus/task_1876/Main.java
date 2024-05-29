package src.timus.task_1876;

import java.util.Scanner;


public class Centipede {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        int case1 = 40 + right * 2;
        int case2 = 78 + 40 + (left-40)*2 + 1;

        System.out.println(Math.max(case1, case2));
    }
}