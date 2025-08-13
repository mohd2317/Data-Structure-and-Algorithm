package List.LinkedLIst;

import java.util.*;
import java.util.stream.Collectors;

public class Basic_Program {
    public static void main(String[] args) {
        System.out.println("===== Java LinkedList All Methods Demo =====");

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        System.out.println("Create & Print: " + list); //[A, B, C]

        // Add elements
        list.add("D");
        list.addFirst("Start");
        list.addLast("End");
        System.out.println("After add, addFirst, addLast: " + list); //[Start, A, B, C, D, End]

        // Offer methods
        list.offer("OfferEnd");
        list.offerFirst("OfferStart");
        list.offerLast("OfferLast");
        System.out.println("After offer methods: " + list); //[OfferStart, Start, A, B, C, D, End, OfferEnd, OfferLast]

        // Access elements
        System.out.println("getFirst(): " + list.getFirst()); //OfferStart
        System.out.println("getLast(): " + list.getLast());   //OfferLast
        System.out.println("peek(): " + list.peek());         //OfferStart
        System.out.println("peekFirst(): " + list.peekFirst());//OfferStart
        System.out.println("peekLast(): " + list.peekLast());  //OfferLast

        // Search
        System.out.println("Contains 'B'? " + list.contains("B")); //true
        System.out.println("Index of 'B': " + list.indexOf("B"));  //3
        System.out.println("Last index of 'B': " + list.lastIndexOf("B")); //3

        // Remove elements
        list.remove("OfferLast");
        list.removeFirst();
        list.removeLast();
        System.out.println("After remove, removeFirst, removeLast: " + list); //[Start, A, B, C, D, End]

        // Poll methods
        System.out.println("poll(): " + list.poll());            //Start
        System.out.println("pollFirst(): " + list.pollFirst());  // A
        System.out.println("pollLast(): " + list.pollLast());    // End
        System.out.println("After poll methods: " + list);       //[B, C, D]

        // Set element
        list.set(0, "Z");
        System.out.println("After set(0, 'Z'): " + list); //[Z, C, D]

        // Merge LinkedLists
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("X", "Y"));
        list.addAll(list2);
        System.out.println("After addAll(list2): " + list);  //[Z, C, D, X, Y]

        // Retain only common elements
        list.retainAll(Arrays.asList("Z", "Y"));
        System.out.println("After retainAll(Z, Y): " + list);  //[Z, Y]

        // Clear
        list.clear();
        System.out.println("After clear(): " + list);      //[]
        System.out.println("isEmpty(): " + list.isEmpty());//true

        // Refill for Iteration examples
        list.addAll(Arrays.asList("One", "Two", "Three", "Four"));

        // ===== Iteration Styles =====
        System.out.println("\n--- Iteration Java 7 ---");
        System.out.print("For loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(); //One Two Three Four

        System.out.print("For-each: ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.print("Iterator: ");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        System.out.print("ListIterator forward: ");
        ListIterator<String> listItr = list.listIterator();
        while (listItr.hasNext()) {
            System.out.print(listItr.next() + " ");
        }
        System.out.println();

        System.out.print("ListIterator backward: ");
        while (listItr.hasPrevious()) {
            System.out.print(listItr.previous() + " ");
        }
        System.out.println();

        System.out.print("DescendingIterator: ");
        Iterator<String> descItr = list.descendingIterator();
        while (descItr.hasNext()) {
            System.out.print(descItr.next() + " ");
        }
        System.out.println();

        // ===== Java 8 Iteration =====
        System.out.println("\n--- Iteration Java 8 ---");
        System.out.print("forEach + Lambda: ");
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.print("forEach + Method Reference: ");
        list.forEach(System.out::print);
        System.out.println();

        System.out.print("Stream filter startsWith 'T': ");
        list.stream().filter(e -> e.startsWith("T")).forEach(System.out::print);
        System.out.println(); //TwoThree

        System.out.print("Stream map to uppercase: ");
        list.stream().map(String::toUpperCase).forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.print("Collect to List: ");
        List<String> upperList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperList);
    }
}

/*
Underlying DS is Double LL
Insertion Order is Preserved, Duplicates obj allowed, Heterogeneous obj/Null is possible.
LL implements Serializable & Clonable Interface but not Random Access.
LL is the best choice if our frequent operation is Insertion/Deletion in the middle.
 */
