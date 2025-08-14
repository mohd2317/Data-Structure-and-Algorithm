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

        // 7. Access elements
        System.out.println("First Element: " + vector.firstElement());
        System.out.println("Last Element: " + vector.lastElement());
        System.out.println("Element at index 2: " + vector.get(2));

        // 8. Search
        System.out.println("Contains 'Mango'? " + vector.contains("Mango"));
        System.out.println("'Banana' index: " + vector.indexOf("Banana"));
        System.out.println("'Banana' last index: " + vector.lastIndexOf("Banana"));

        // 9. Remove elements
        vector.remove("Mango");
        vector.remove(2);
        vector.removeElement("Apple");
        vector.removeElementAt(0);
        System.out.println("After removals: " + vector);

        // 10. Replace element
        vector.set(1, "Kiwi");
        System.out.println("After replace: " + vector);

        // 11. Capacity and size
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        // 12. Clone
        Vector<String> clonedVector = (Vector<String>) vector.clone();
        System.out.println("Cloned Vector: " + clonedVector);

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
        System.out.println("After clear: " + vector);
    }
}

