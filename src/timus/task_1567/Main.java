package src.timus.task_1567;

import java.util.Scanner;

public class SMSSpan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int cost = 0;
        for (char c:input.toCharArray()) {
            int index = ".,! ".indexOf(c);
            if (index != -1){
                cost += index%3+1;
            }else{
                int aux = (int) c;
                cost += ((aux-97) %3) + 1;
            }
        }
        System.out.println(cost);
    }

}