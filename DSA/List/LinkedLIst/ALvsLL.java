package List.LinkedLIst;

import java.util.*;

public class ALvsLL {
    public static void main(String[] args) {
        System.out.println("===== ArrayList vs LinkedList Comparison =====");

        // --- Create Lists ---
        List<String> arrayList = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> linkedList = new LinkedList<>(Arrays.asList("A", "B", "C"));

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // --- Add elements ---
        arrayList.add("D");
        linkedList.add("D");

        arrayList.add(1, "X");
        linkedList.add(1, "X");

        System.out.println("After add:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // --- Get elements ---
        System.out.println("Get index 2 - ArrayList: " + arrayList.get(2));
        System.out.println("Get index 2 - LinkedList: " + linkedList.get(2));

        // --- Remove elements ---
        arrayList.remove(1);
        linkedList.remove(1);

        System.out.println("After remove index 1:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // --- Iteration Java 7 ---
        System.out.print("ArrayList for-each: ");
        for (String s : arrayList) System.out.print(s + " ");
        System.out.println();

        System.out.print("LinkedList for-each: ");
        for (String s : linkedList) System.out.print(s + " ");
        System.out.println();

        // --- Iteration Java 8 ---
        System.out.print("ArrayList stream: ");
        arrayList.stream().forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.print("LinkedList stream: ");
        linkedList.stream().forEach(e -> System.out.print(e + " "));
        System.out.println();

        // --- Performance Demo ---
        int n = 100000;

        // ArrayList add at end
        long start = System.nanoTime();
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) al.add(i);
        long end = System.nanoTime();
        System.out.println("ArrayList add end: " + (end - start) / 1e6 + " ms");

        // LinkedList add at end
        start = System.nanoTime();
        List<Integer> ll = new LinkedList<>();
        for (int i = 0; i < n; i++) ll.add(i);
        end = System.nanoTime();
        System.out.println("LinkedList add end: " + (end - start) / 1e6 + " ms");

        // ArrayList get middle
        start = System.nanoTime();
        for (int i = 0; i < n; i++) al.get(n / 2);
        end = System.nanoTime();
        System.out.println("ArrayList get middle: " + (end - start) / 1e6 + " ms");

        // LinkedList get middle
        start = System.nanoTime();
        for (int i = 0; i < n; i++) ll.get(n / 2);
        end = System.nanoTime();
        System.out.println("LinkedList get middle: " + (end - start) / 1e6 + " ms");

        // ArrayList remove from start
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) al.remove(0);
        end = System.nanoTime();
        System.out.println("ArrayList remove start: " + (end - start) / 1e6 + " ms");

        // LinkedList remove from start
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) ll.remove(0);
        end = System.nanoTime();
        System.out.println("LinkedList remove start: " + (end - start) / 1e6 + " ms");
    }
}

/*
System.nanoTime() is preferred over System.currentTimeMillis() for measuring elapsed time because it’s more precise.
(end - start) gives the total elapsed time in nanoseconds.

Dividing by 1e6 converts nanoseconds → milliseconds.

This prints how long it took to add n elements at the end of the ArrayList.

In performance comparison between ArrayList and LinkedList,
Adding at end is usually faster for ArrayList (due to contiguous memory)
Adding at beginning or middle is slower for ArrayList because shifting elements is required.
For LinkedList, adding at end can be O(1) if we already have a reference to the tail node.
 */
