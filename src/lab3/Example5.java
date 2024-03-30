package src.lab3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер числа в последовательности: ");
        int n = scanner.nextInt();

        scanner.close();

        int fibNum = fib(n , 0);
        System.out.println(String.format("\nЧисло Фибоначчи на позиции %s равно %s", n, fibNum));
    }

    public static int fib(int n, int level) {
        int nextLevel = level;

        if (level == 0) {
            System.out.println(String.format("fib(%s)", n));
        }
        if (n == 0) {return 0;}
        if (n == 1) {return 1;}

        for (int i = 0; i < nextLevel; i++) {
            System.out.print(" ");
        }

        System.out.println(String.format("|- fib(%s)", n - 2));
        int fibNMinus2 = fib(n - 2, nextLevel + 1);

        for (int i =0; i < nextLevel; i++) {
            System.out.print(" ");
        }

        System.out.println(String.format("|- fib(%s)", n - 1));
        int fibNMinus1 = fib(n - 1, nextLevel + 1);
        return fibNMinus1 + fibNMinus2;
    }
}