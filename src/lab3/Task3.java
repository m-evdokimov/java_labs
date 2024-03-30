package src.lab3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("");
        inputArray(arr, 0, scanner);
        System.out.println("\nМассив:");
        outputArray(arr, 0);
        scanner.close();
    }

    public static void inputArray(int[] arr, int index, Scanner scanner) {
        if (index < arr.length) {
            System.out.print("Введите элемент " + (index + 1) + ": ");
            arr[index] = scanner.nextInt();
            inputArray(arr, index + 1, scanner);
        }
    }

    public static void outputArray(int[] arr, int index) {
        if (index < arr.length) {
            System.out.println(arr[index]);
            outputArray(arr, index + 1);
        }
    }
}
