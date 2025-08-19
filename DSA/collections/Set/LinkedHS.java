package collections.Set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHS {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // add() – Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate, ignored
        set.add(null); // One null allowed

        System.out.println("LinkedHashSet: " + set); //[Apple, Banana, Orange, null]

        // size() – Number of elements
        System.out.println("Size: " + set.size()); //4

        // contains() – Check if element exists
        System.out.println("Contains 'Banana'? " + set.contains("Banana")); //true

        // remove() – Remove element
        set.remove("Orange");
        System.out.println("After removing Orange: " + set); //[Apple, Banana, null]

        // isEmpty() – Check if empty
        System.out.println("Is empty? " + set.isEmpty()); //false

        // iterator() – Iterating over elements
        System.out.print("Iterating: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // clear() – Remove all elements
        set.clear();
        System.out.println("After clear: " + set);
    }
}

/*
1. When to Use
You need unique elements and care about preserving the insertion order.
Example use cases:
Cache implementation (LRU cache base).
Maintaining a unique list where order matters.
Filtering duplicates while keeping original sequence.

Time Complexity:
Add / Remove / Contains → O(1) average, O(n) worst-case (collisions).
Iteration → O(n) in insertion order.
Internal Working: Uses LinkedHashMap (doubly linked list + hash table).


2. Why Use LinkedHashSet?
Maintains insertion order unlike HashSet.
Fast operations: O(1) average for add, remove, contains.
No duplicates.
Allows one null element.


3. Why Not Use
Slightly slower than HashSet because of maintaining a linked list for order.
No indexing like ArrayList.
More memory usage than HashSet.


Must-Know
Choose HashSet if order doesn’t matter (better performance).
Choose LinkedHashSet if order must be preserved.
Choose TreeSet if sorting is needed.
When storing custom objects, override hashCode() & equals().
 */
