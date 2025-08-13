package List.ArrayList;

import java.util.*;

public class Basic_Program {
    public static void main(String[] args) {
        // Create ArrayList (Raw type — not recommended in real projects)
        List l = new ArrayList();

        // Adding elements
        l.add("A");
        l.add("B");
        l.add("C");
        l.add(17);     // Integer
        l.add(null);   // null value allowed
        System.out.println("Initial List: " + l); //Initial List: [A, B, C, 17, null]

        // Add at specific index
        l.add(2, "Inserted");
        System.out.println("After inserting at index 2: " + l); //[A, B, Inserted, C, 17, null]


        // Replace element
        l.set(3, "Replaced");
        System.out.println("After replacing index 3: " + l);  //[A, B, Inserted, Replaced, 17, null]

        // Remove by index
        l.remove(4);
        System.out.println("After removing index 4: " + l); //[A, B, Inserted, Replaced, null]

        // Remove by object
        l.remove("B");
        System.out.println("After removing object 'B': " + l); //[A, Inserted, Replaced, null]

        // Check if contains element
        System.out.println("List contains 'A' ? " + l.contains("A")); //true

        // Get element at index
        System.out.println("Element at index 1: " + l.get(1)); //Inserted

        // Get index of element
        System.out.println("Index of 'C': " + l.indexOf("C")); //-1

        // Check if list is empty
        System.out.println("Is list empty? " + l.isEmpty());  //false

        // Get size
        System.out.println("List size: " + l.size());  //4

        // Clone list
        ArrayList clonedList = (ArrayList) ((ArrayList) l).clone();
        System.out.println("Cloned list: " + clonedList);          //[A, Inserted, Replaced, null]

        // Sublist
        List subList = l.subList(0, 2);
        System.out.println("SubList (0 to 2): " + subList);       //[A, Inserted]

        // Convert to array
        Object[] arr = l.toArray();
        System.out.println("Array from list: " + Arrays.toString(arr)); //[A, Inserted, Replaced, null]

        // Clear list
        clonedList.clear();
        System.out.println("After clearing cloned list: " + clonedList); //[]

        //ByDefault AL is non-synchronized But we can get Syn version of AL obj by using synchronizedList() of Collections class.
        List synList = Collections.synchronizedList(l);

        System.out.println("\n===== Iterations =====");

        // 1. Using traditional for loop
        System.out.println("For loop:");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        // 2. Using enhanced for loop
        System.out.println("\nEnhanced for loop:");
        for (Object obj : l) {
            System.out.println(obj);
        }

        // 3. Using Iterator
        System.out.println("\nIterator:");
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 4. Using ListIterator (forward & backward)
        System.out.println("\nListIterator forward:");
        ListIterator listItr = l.listIterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }
        System.out.println("ListIterator backward:");
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }

        // 5. Using forEach (Java 8 method reference)
        System.out.println("\nJava 8 forEach with method reference:");
        l.forEach(System.out::println);

        // 6. Using forEach with lambda
        System.out.println("\nJava 8 forEach with lambda:");
        l.forEach(e -> System.out.println("Element: " + e));

        // 7. Using Stream API
        System.out.println("\nJava 8 Stream API:");
        l.stream().forEach(System.out::println);
    }
}

/*
AL is an Ordered collection (Resizable/Growable Array).
It contains duplicates elements,
Insertion order is preserved,
Heterogeneous obj and null is allowed.

AL (Serializable/Clonable/Random Access) and Vector classes implements Random Access Interface(Marker Interface).
So that any random element we can access with the same speed.

AL is the best choice if our frequent operation is retrieval operation because it implements RA interface.

Initial Capacity = 10 || (CC*3/2)+1
 */