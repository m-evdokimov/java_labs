package src.timus.task_1349;

import java.util.Scanner;

public class Farm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n==1){
            System.out.println(1 + " " + 2 + " " + 3);
        }else if(n==2){
            System.out.println(3 + " " + 4 + " " + 5);
        }else{
            System.out.println(-1);
        }
    }
}