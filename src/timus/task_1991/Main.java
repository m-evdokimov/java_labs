package src.timus.task_1991;

import java.util.Scanner;

import static java.lang.Math.abs;

public class TheBattle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int k = Integer.parseInt(scanner.next());
        int soldiers = 0;
        int survivingDroids = 0, unusedBoomBooms = 0;

        for (int i = 0; i<n; i++){
            soldiers = Integer.parseInt(scanner.next()) - k;
            if (soldiers>0){
                survivingDroids += soldiers;
            } else {
                unusedBoomBooms += abs(soldiers);
            }
        }

        System.out.println(survivingDroids + " " + unusedBoomBooms);
    }
}