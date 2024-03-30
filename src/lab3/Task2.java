package src.lab3;

import java.util.Scanner;

public class Task2 {
    public static String decToBin(int n) {
        if (n == 0) { return "0"; }
        else if (n == 1) { return "1"; }
        else {
            return decToBin(n / 2) + n % 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Число: ");
        int num = scanner.nextInt();

        String bin = decToBin(num);
        System.out.println(bin);
        scanner.close();
    }
}