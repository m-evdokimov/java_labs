package src.lab5;

import java.util.Random;

class MaxThread extends Thread {
    private int[] arr;
    private int start_i, end_i;
    private int max = Integer.MIN_VALUE;

    public MaxThread(int[] arr, int start_i, int end_i) {
        this.arr = arr;
        this.start_i = start_i;
        this.end_i = end_i;
    }

    @Override
    public void run() {
        for (int i = start_i; i < end_i; i++) {
            max = Math.max(max, arr[i]);
        }
    }

    public int getMax() {
        return max;
    }
}

public class Task5 {
    public static int findMaxParallel(int[] arr, int numThreads) throws InterruptedException {
        MaxThread[] threads = new MaxThread[numThreads];
        int subarrSize = arr.length / numThreads;

        int start_i = 0;
        for (int i = 0; i < numThreads; i++) {
            int end_i = (i == numThreads - 1 ) ? arr.length : start_i + subarrSize;
            threads[i] = new MaxThread(arr, start_i, end_i);
            threads[i].start();
            start_i = end_i;
        }

        int max = Integer.MIN_VALUE;
        for (MaxThread t: threads) {
            t.join();
            max = Math.max(max, t.getMax());
        }
        return max;
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
            int max = findMaxParallel(arr, numThreads);
            long took = System.currentTimeMillis() - startT;
            System.out.println(String.format("Max elem: %s, time: %s, n_threads: %s", max, took, numThreads));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

