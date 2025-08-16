package Queue;

import java.util.*;

public class Basic_Program {
    public static void main(String[] args) {
        // ===== Default Queue using LinkedList =====
        Queue<String> queue = new LinkedList<>();

        // add / offer
        queue.add("Apple");
        queue.offer("Banana");
        queue.add("Cherry");

        System.out.println("Queue after add/offer: " + queue); //[Apple, Banana, Cherry]

        // peek / element
        System.out.println("Peek (head): " + queue.peek());       //Apple // null if empty
        System.out.println("Element (head): " + queue.element()); //Apple // exception if empty

        // remove / poll
        System.out.println("Remove (head): " + queue.remove());  //Apple   // throws exception if empty
        System.out.println("Poll (head): " + queue.poll());     //Banana  // returns null if empty
        System.out.println("Queue after remove/poll: " + queue);//[Cherry]

        // ===== Iteration in Java 7 =====
        System.out.println("\n--- Iteration Java 7 ---");
        for (String s : queue) {
            System.out.println("For-each: " + s);
        }

        Iterator<String> it = queue.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator: " + it.next());
        }

        // ===== Iteration in Java 8 =====
        System.out.println("\n--- Iteration Java 8 ---");
        queue.forEach(s -> System.out.println("Lambda: " + s));
        queue.stream().map(String::toUpperCase).forEach(System.out::println);

        // ===== PriorityQueue (Default Natural Sorting) =====
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.addAll(Arrays.asList(5, 1, 3, 9, 2));
        System.out.println("\nPriorityQueue (Natural Order): " + pq); //[1, 2, 3, 9, 5]
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); //1 2 3 5 9  // prints in ascending
        }

        // ===== PriorityQueue with Custom Comparator (Descending) =====
        PriorityQueue<Integer> pqDesc = new PriorityQueue<>(Comparator.reverseOrder());
        pqDesc.addAll(Arrays.asList(5, 1, 3, 9, 2));
        System.out.println("\n\nPriorityQueue (Custom Desc Order): " + pqDesc);  //[9, 5, 3, 1, 2]
        while (!pqDesc.isEmpty()) {
            System.out.print(pqDesc.poll() + " ");  //9 5 3 2 1
        }
    }
}

/*
2. Why Use Queue?
Natural fit when order of processing matters (tasks, jobs, requests).
Used in:
Task scheduling (OS, printers, CPUs).
BFS (Breadth-First Search) in graphs/trees.
Producer-Consumer problems.
Resource management (thread pools, DB connections).


3. When to Use
FIFO requirement.
Fair order processing.
Scheduling problems.


4. Why Not Use
Not efficient for random access (use ArrayList instead).
For LIFO (Last In First Out) → use Stack / Deque.
For sorted elements → use PriorityQueue or TreeSet.


Interview / DSA Points
Queue methods:
add(e) / offer(e) → insert
remove() / poll() → delete
element() / peek() → access front

Time complexity:
Enqueue (add): O(1)
Dequeue (remove): O(1)
Peek: O(1)
PriorityQueue internally uses a binary heap.
ArrayDeque is faster than LinkedList for queue ops.

Must-Know
Use ArrayDeque in modern apps (faster, non-synchronized).
Avoid PriorityQueue for custom ordering without Comparator` → can cause ClassCastException.
LinkedList is a universal List + Queue + Deque.
 */