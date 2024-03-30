package src.lab3;

import java.util.*;

public class Benchmark {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10000000; i++) {
            hashSet.add(i);
        }

        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < 10000000; i++) {
            linkedHashMap.put(i, i);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i);
        }

        System.out.println("Добавить элемент в HashSet = " + getRunningTimeAdd(hashSet));
        System.out.println("Добавить элемент в LinkedHashMap = " + getRunningTimeAdd(linkedHashMap));

        System.out.println("\nДобавить в конец ArrayList = " + getRunningTimeAddLast(arrayList));
        System.out.println("Добавить в центр ArrayList = " + getRunningTimeAddCenter(arrayList));
        System.out.println("Добавить в начало ArrayList = " + getRunningTimeAddFirst(arrayList));

        System.out.println("\nУдалить из HashSet = " + getRunningTimeRemove(hashSet));
        System.out.println("Удалить из LinkedHashMap = " + getRunningTimeRemove(linkedHashMap));

        System.out.println("\nУдалить в конце ArrayList = " + getRunningTimeRemoveLast(arrayList));
        System.out.println("Удалить в центре ArrayList = " + getRunningTimeRemoveCenter(arrayList));
        System.out.println("Удалить в начале ArrayList = " + getRunningTimeRemoveFirst(arrayList));

        ArrayList<Integer> bigArrayList = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            bigArrayList.add(i);
        }
        LinkedHashMap<Integer, Integer> bigLinkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < 10000000; i++) {
            bigLinkedHashMap.put(i, i);
        }

        System.out.println("\nИзвлечь по индексу ArrayList = " + getRunningTimeGetElement(bigArrayList));
        System.out.println("Извлечь по индексу LinkedHashMap = " + getRunningTimeGetElement(bigLinkedHashMap));
    }

    private static long getRunningTimeAdd(HashSet<Integer> hashSet){
        long start = System.currentTimeMillis();
        hashSet.add(10000000);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeAdd(LinkedHashMap<Integer, Integer> linkedHashMap){
        long start = System.currentTimeMillis();
        linkedHashMap.put(10000000, 10000000);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeAddLast(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        arrayList.add(10000000);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeAddFirst(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        arrayList.add(0, -1);
        long end = System.currentTimeMillis();
        return end - start;
    }    
    private static long getRunningTimeAddCenter(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        arrayList.add(arrayList.size() / 2, -1);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemove(HashSet<Integer> hashSet){
        long start = System.currentTimeMillis();
        hashSet.remove(9000000);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemove(LinkedHashMap<Integer, Integer> linkedHashMap){
        long start = System.currentTimeMillis();
        linkedHashMap.remove(9000000);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemoveLast(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        arrayList.remove(arrayList.size() - 2);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemoveCenter(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        arrayList.remove(arrayList.size() / 2);
        long end = System.currentTimeMillis();
        return end - start;
    }
    private static long getRunningTimeRemoveFirst(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        arrayList.remove(0);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeGetElement(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        arrayList.get(arrayList.size() / 2);
        long end = System.currentTimeMillis();
        return end - start;
    }
    private static long getRunningTimeGetElement(LinkedHashMap<Integer, Integer> arrayList){
        long start = System.currentTimeMillis();
        arrayList.get(arrayList.size() / 2);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
