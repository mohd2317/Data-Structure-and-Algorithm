package collections.Set;

import java.util.*;

public class TreeSetProg {
    public static void main(String[] args) {
        // Create TreeSet (Natural order)
        TreeSet<String> ts = new TreeSet<>();

        // add() – Adding elements
        ts.add("Banana");
        ts.add("Apple");
        ts.add("Mango");
        ts.add("Orange");
        ts.add("Grapes");
        ts.add("Apple"); // Duplicate ignored

        System.out.println("TreeSet: " + ts); // Sorted automatically [Apple, Banana, Grapes, Mango, Orange]

        // ---------- Custom Sorting (Descending Order) ----------
        TreeSet<String> customSet = new TreeSet<>(Collections.reverseOrder());
        customSet.addAll(ts);
        System.out.println("Custom Sorted TreeSet (Descending): " + customSet); // [Orange, Mango, Grapes, Banana, Apple]

        // size()
        System.out.println("Size: " + ts.size()); //5

        // contains()
        System.out.println("Contains 'Mango'? " + ts.contains("Mango")); //true

        // first(), last()
        System.out.println("First element: " + ts.first()); //Apple
        System.out.println("Last element: " + ts.last());   //Orange

        // higher(), lower()
        System.out.println("Higher than 'Mango': " + ts.higher("Mango")); //Orange
        System.out.println("Lower than 'Mango': " + ts.lower("Mango"));   //Grapes

        // headSet(), tailSet(), subSet()
        System.out.println("HeadSet (< Mango): " + ts.headSet("Mango"));       //[Apple, Banana, Grapes]
        System.out.println("TailSet (>= Mango): " + ts.tailSet("Mango"));    //[Mango, Orange]
        System.out.println("SubSet (Apple to Orange): " + ts.subSet("Apple", "Orange"));//[Apple, Banana, Grapes, Mango]

        // remove()
        ts.remove("Banana");
        System.out.println("After removing Banana: " + ts); //[Apple, Grapes, Mango, Orange]

        // isEmpty()
        System.out.println("Is empty? " + ts.isEmpty()); //false

        // Iteration (Java 7 style – Iterator)
        System.out.print("Java 7 Iteration: ");
        Iterator<String> it = ts.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Iteration (Java 8 style – forEach + lambda)
        System.out.print("Java 8 forEach + Lambda: ");
        ts.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // Iteration (Java 8 Stream API)
        System.out.print("Java 8 Stream: ");
        ts.stream().forEach(System.out::print);
        System.out.println(); //AppleGrapesMangoOrange

        // clear()
        ts.clear();
        System.out.println("After clear: " + ts);
    }
}

/*
1. When to Use
When you need:
Unique elements.
Sorted order without manual sorting.
Fast search in O(log n) time.
Example: Sorted leaderboards, range queries, auto-suggestions.
Use NavigableSet methods for advanced operations.
Choose TreeSet only when sorted order is required all the time — otherwise, sort a collections.List when needed.


2. Why Use TreeSet?
Automatically sorts elements (ascending by default).
Great when you need unique + sorted data.
Offers navigational methods (first(), last(), higher(), lower(), etc.).
Ideal for range-based queries (subSet(), headSet(), tailSet()).


3. Why Not Use
Slower than HashSet / LinkedHashSet for insertion and lookup (O(log n) vs O(1)).
No null elements allowed (throws NullPointerException).
Higher memory usage compared to HashSet.
If sorting is not needed, use HashSet for better performance.


HashSet → Fastest for general-purpose uniqueness, unordered.
LinkedHashSet → Keeps insertion order, slight memory overhead.
SortedSet → Only defines sorted order; actual implementation needed.
NavigableSet → SortedSet + navigation methods.
TreeSet → Implementation of NavigableSet using Red-Black Tree, O(log n) operations.
 */
