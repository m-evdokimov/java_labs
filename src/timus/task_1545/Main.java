package src.timus.task_1545;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i<n; i++){
            strings.add(scanner.next());
        }
        char input = scanner.next().charAt(0);
        for (String s: strings){
            if (s.charAt(0)==input){
                System.out.println(s);
            }
        }
    }
}