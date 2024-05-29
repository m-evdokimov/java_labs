package src.timus.task_1607;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int petrOffer = scanner.nextInt();
        int petrRate = scanner.nextInt();
        int driverOffer = scanner.nextInt();
        int driverRate = scanner.nextInt();
        int finalPrice;
        while(true){
            if (petrOffer>=driverOffer){
                finalPrice = petrOffer;
                break;
            }
            if (petrOffer+petrRate>=driverOffer){
                finalPrice = driverOffer;
                break;
            }else{
                petrOffer+=petrRate;
            }

            if (driverOffer-driverRate<=petrOffer){
                finalPrice = petrOffer;
                break;
            }else{
                driverOffer-=driverRate;
            }
        }
        System.out.println(finalPrice);
    }
}