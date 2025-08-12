package List_ArrayList;

import java.util.*;

public class BasicWithGenerics {
    public static void main(String[] args) {

        // stores only Strings || Generics → Type safety, no casting, avoids ClassCastException.
        List<String> list = new ArrayList<>();

        // Add elements
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Initial List: " + list); //[A, B, C]

        // Add at specific index
        list.add(1, "Inserted");
        System.out.println("After inserting at index 1: " + list); //[A, Inserted, B, C]

        // Replace element
        list.set(2, "Replaced");
        System.out.println("After replacing index 2: " + list); //[A, Inserted, Replaced, C]

        // Remove by index
        list.remove(3);
        System.out.println("After removing index 3: " + list); //[A, Inserted, Replaced]

        // Remove by object
        list.remove("A");
        System.out.println("After removing 'A': " + list); //[Inserted, Replaced]

        // Check if contains element
        System.out.println("List contains 'B'? " + list.contains("B")); //false

        // Get element at index
        System.out.println("Element at index 0: " + list.get(0)); //Inserted

        // Get index of element
        System.out.println("Index of 'Replaced': " + list.indexOf("Replaced")); //1

        // Size
        System.out.println("List size: " + list.size()); //2

        // Is empty?
        System.out.println("Is list empty? " + list.isEmpty()); //false

        // Clone (shallow copy)
        ArrayList<String> clonedList = new ArrayList<>(list);
        System.out.println("Cloned list: " + clonedList);     //[Inserted, Replaced]

        // Sublist
        List<String> subList = list.subList(0, 2);
        System.out.println("Sublist (0 to 2): " + subList); //[Inserted, Replaced]

        // Convert to array
        String[] arr = list.toArray(new String[0]);
        System.out.println("Array from list: " + Arrays.toString(arr)); //[Inserted, Replaced]

        // Clear cloned list
        clonedList.clear();
        System.out.println("After clearing cloned list: " + clonedList); //[]

        System.out.println("\n===== Iterations =====");

        // 1. For loop
        System.out.println("For loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 2. Enhanced for loop
        System.out.println("\nEnhanced for loop:");
        for (String s : list) {
            System.out.println(s);
        }

        // 3. Iterator
        System.out.println("\nIterator:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 4. ListIterator (forward & backward)
        System.out.println("\nListIterator forward:");
        ListIterator<String> listItr = list.listIterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }
        System.out.println("ListIterator backward:");
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }

        // 5. Java 8 forEach + method reference
        System.out.println("\nJava 8 forEach with method reference:");
        list.forEach(System.out::println);

        // 6. Java 8 forEach + lambda
        System.out.println("\nJava 8 forEach with lambda:");
        list.forEach(s -> System.out.println("Element: " + s));

        // 7. Java 8 Stream API
        System.out.println("\nJava 8 Stream API:");
        list.stream().forEach(System.out::println);
    }
}
