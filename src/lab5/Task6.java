package src.lab5;

import java.util.Random;

class SumThread extends Thread {
    private int[] arr;
    private int start_i, end_i;
    private int sum = 0;

    public SumThread(int[] arr, int start_i, int end_i) {
        this.arr = arr;
        this.start_i = start_i;
        this.end_i = end_i;
    }

    @Override
    public void run() {
        for (int i = start_i; i < end_i; i++) {
            sum += arr[i];
        }
    }

    public int getSum() {
        return sum;
    }
}

public class Task6 {
    public static int findSumParallel(int[] arr, int numThreads) throws InterruptedException {
        SumThread[] threads = new SumThread[numThreads];
        int subarrSize = arr.length / numThreads;

        int start_i = 0;
        for (int i = 0; i < numThreads; i++) {
            int end_i = (i == numThreads - 1 ) ? arr.length : start_i + subarrSize;
            threads[i] = new SumThread(arr, start_i, end_i);
            threads[i].start();
            start_i = end_i;
        }

        int sum = 0;
        for (SumThread t: threads) {
            t.join();
            sum += t.getSum();
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 100_000_000;
        int[] arr = new int[n];

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1337);
        }
        
        int numThreads = Runtime.getRuntime().availableProcessors();
        try {
            long startT = System.currentTimeMillis();
            int sum = findSumParallel(arr, numThreads);
            long took = System.currentTimeMillis() - startT;
            System.out.println(String.format("Sum elem: %s, time: %s, n_threads: %s", max, took, numThreads));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

