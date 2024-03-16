package src.lab2.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();
        scanner.nextLine();

        Cipher cipher = new Cipher(key, 26, 'a');
        String encoded = cipher.encode(text);
        System.out.println("Текст после преобразования: " + encoded);

        boolean stop = false;
        while (!stop) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String command = scanner.nextLine().trim().toLowerCase();

        if (command.equals("y")) {
            String decoded = cipher.decode(encoded);
            System.out.println("Текст после обратного преобразования: " + decoded);
            stop = true;
        } else if (command.equals("n")) {
            System.out.println("До свидания!");
            stop = true;
        } else {
            System.out.println("Введите корректный ответ.");
        }
       }
        scanner.close();
    }
}