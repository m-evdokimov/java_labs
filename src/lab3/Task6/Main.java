package src.lab3.Task6;

import java.util.ArrayList; import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        int N = 100000;
        int k = 2;
        Josephus josephusArrayList = new Josephus(N, k, new ArrayList<Integer>());
        Josephus josephusLinkedList = new Josephus(N, k, new LinkedList<Integer>());

        long startTime = System.nanoTime();
        int arrayListSurvivor = josephusArrayList.josephus();
        long arrayListTimeMs = (System.nanoTime() - startTime) / 1_000_000;
 
        startTime = System.nanoTime();
        int linkedListSurvivor = josephusLinkedList.josephus();
        long linkedListTimeMs = (System.nanoTime() - startTime) / 1_000_000;
 
        System.out.println(String.format("ArrayList: %s | time : %s ms", arrayListSurvivor, arrayListTimeMs));
        System.out.println(String.format("LinkedList: %s | time : %s ms", linkedListSurvivor, linkedListTimeMs));
    } 
}