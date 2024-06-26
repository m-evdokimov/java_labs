package src.timus.task_1313;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size;
        int matrix[][];
        String output = "";
        size = scanner.nextInt();
        matrix = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < size; i++){
            int[] index = {i, 0};
            output += getDiag(index, false, matrix, size);
        }

        for (int i = 1; i < size; i++){
            int[] index = {size - 1, i};
            output += getDiag(index, true, matrix, size);
        }

        System.out.print(output.substring(0, output.length()-1));

    }

    private static String getDiag(int index[], boolean bottom, int matrix[][], int size){
        String output = "";
        if (!bottom){
            int count = 0;
            for (int i = index[0]; i >= 0; i--){
                try {
                    output += matrix[i][count] + " ";
                    count++;
                } catch (Exception e){
                    continue;
                }
            }
        } else {
            int count = 0;
            for (int i = index[1]; i <= size; i++){
                try {
                    output += matrix[size - count - 1][i] + " ";
                    count++;
                } catch (Exception e){
                    continue;
                }
            }
        }
        return output;
    }
}