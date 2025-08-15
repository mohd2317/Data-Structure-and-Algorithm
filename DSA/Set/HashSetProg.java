package Set;

import java.util.Iterator;

public class HashSetProg {
    public static void main(String[] args) {
        java.util.HashSet<String> set = new java.util.HashSet<>();

        // add() – Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate, will not be added
        set.add(null); // One null allowed

        System.out.println("HashSet: " + set); //[null, Apple, Orange, Banana]

        // size() – Number of elements
        System.out.println("Size: " + set.size()); //4

        // contains() – Check if element exists
        System.out.println("Contains 'Banana'? " + set.contains("Banana")); //true

        // remove() – Remove element
        set.remove("Orange");
        System.out.println("After removing Orange: " + set); //[null, Apple, Banana]

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
        System.out.println("After clear: " + set); //[]
    }
}

/*
1. Must-Know
Use HashSet when:
Order doesn’t matter. You need unique elements without caring about order.
You want fast duplicate checking.
For ordered unique elements: LinkedHashSet.
For sorted unique elements: TreeSet.
When storing custom objects, override hashCode() and equals().

Example use cases:
Removing duplicates from a list.
Storing visited nodes in graph algorithms.
Checking membership efficiently.

2. Why Use HashSet?
Fast operations: Average O(1) time complexity for add, remove, contains.
No duplicates: Automatically filters them out.
Null support: Allows one null element.

4. Why Not Use
Unordered: No control over iteration order.
No indexing: Cannot access elements by position.
Poor for sorted data: Use TreeSet if sorting is needed.
More memory: Uses extra space internally for hashing.


 */
