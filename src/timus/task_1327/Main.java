package src.timus.task_1327;

import java.util.Scanner;

public class Fuses {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int firstDay = scanner.nextInt();
        if (firstDay % 2 == 0){
            firstDay++;
        }
        int lastDay = scanner.nextInt();
        if (lastDay % 2 == 0){
            lastDay--;
        }
        System.out.println((lastDay-firstDay+2)/2);
    }
}