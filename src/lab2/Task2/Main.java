package src.lab2.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Количество строк: ");
        int rowCount = scanner.nextInt();
        System.out.println("Количество стобцов: ");
        int columnCount = scanner.nextInt();

        scanner.close();

        SnakeArray arr = new SnakeArray(rowCount, columnCount);
        arr.print();
    }
}