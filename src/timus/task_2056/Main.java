package src.timus.task_2056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int grade;
        double average = 0;
        boolean satisfactory = false;
        boolean excellent = true;
        for (int i=0; i<n; i++){
            grade = scanner.nextInt();
            if (grade==3){
                satisfactory = true;
            }
            if (grade!=5){
                excellent = false;
            }
            average += grade;
        }

        if (satisfactory){
            System.out.println("None");
        } else if(excellent){
            System.out.println("Named");
        } else if(average/n>=4.5){
            System.out.println("High");
        } else{
            System.out.println("Common");
        }
    }
}