package List.Vector;

import java.util.*;

public class Basic_Program {
    public static void main(String[] args) {
        // 1. Create Vector
        Vector<String> vector = new Vector<>();

        // 2. Add elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // 3. Add element at specific index
        vector.add(1, "Mango");

        // 4. Add multiple elements at once
        Collections.addAll(vector, "Orange", "Pineapple");

        // 5. Insert element at first & last position
        vector.insertElementAt("Grapes", 0);
        vector.addElement("Watermelon");

        // 6. Display
        System.out.println("Initial Vector: " + vector);
        //[Grapes, Apple, Mango, Banana, Cherry, Orange, Pineapple, Watermelon]

        // 7. Access elements
        System.out.println("First Element: " + vector.firstElement()); //Grapes
        System.out.println("Last Element: " + vector.lastElement());   //Watermelon
        System.out.println("Element at index 2: " + vector.get(2));    //Mango

        // 8. Search
        System.out.println("Contains 'Mango'? " + vector.contains("Mango")); //true
        System.out.println("'Banana' index: " + vector.indexOf("Banana"));   //3
        System.out.println("'Banana' last index: " + vector.lastIndexOf("Banana")); //3

        // 9. Remove elements
        vector.remove("Mango");
        vector.remove(2);
        vector.removeElement("Apple");
        vector.removeElementAt(0);
        System.out.println("After removals: " + vector); //[Cherry, Orange, Pineapple, Watermelon]

        // 10. Replace element
        vector.set(1, "Kiwi");
        System.out.println("After replace: " + vector); //[Cherry, Kiwi, Pineapple, Watermelon]

        // 11. Capacity and size
        System.out.println("Size: " + vector.size());         //4
        System.out.println("Capacity: " + vector.capacity()); //10

        // 12. Clone
        Vector<String> clonedVector = (Vector<String>) vector.clone();
        System.out.println("Cloned Vector: " + clonedVector);  //[Cherry, Kiwi, Pineapple, Watermelon]

        // 13. Iterations - Java 7
        System.out.println("\nIteration using Enumeration:");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("\nIteration using Iterator:");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nIteration using ListIterator (forward):");
        ListIterator<String> listIterator = vector.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nIteration using ListIterator (backward):");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("\nIteration using for-each loop:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // 14. Iteration - Java 8
        System.out.println("\nIteration using forEach & Lambda:");
        vector.forEach(e -> System.out.println(e));

        System.out.println("\nIteration using Stream API:");
        vector.stream().forEach(System.out::println);

        // 15. Clear vector
        vector.clear();
        System.out.println("After clear: " + vector); //[]
    }
}

/*
Q: Difference between ArrayList and Vector?
A: Both are dynamic arrays. The only major difference is that Vector methods are synchronized, making it thread-safe but slower.

Q: When to choose Vector over ArrayList?
A: When multiple threads are modifying the list and you want automatic synchronization without using Collections.synchronizedList().

Q: Why not just use ArrayList + synchronization?
A: You can — Collections.synchronizedList(new ArrayList<>()) is more explicit and often preferred in new code.


 What to use instead?

Use ArrayList if:
Single-threaded
Need fast random access
Don’t need built-in synchronization

Use CopyOnWriteArrayList if:
Multi-threaded
More reads than writes
Need concurrency without locking on every method

Use LinkedList if:
Many insertions/deletions in the middle
Don’t need random access often
 */