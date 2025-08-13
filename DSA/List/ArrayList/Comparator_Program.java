//WAP that sorts a List of String Obj in descending Order using a Custom Comparator.
package List.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Program {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Bear", "Zebra", "Lion", "ANt");
        System.out.println("Before sorting: " + l);

        sortInDescending(l);
        System.out.println("After sorting (Descending): " + l);

        // Java 8 Lambda version
//        l.sort((s1, s2) -> s2.compareToIgnoreCase(s1));
//
//        System.out.println("After sorting (Descending): " + l);
    }

    public static void sortInDescending(List<String> stringList) {
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Reverse order by swapping s1 and s2
                return s2.compareToIgnoreCase(s1);
            }
        });
    }
}


/*
Before sorting: [Bear, Zebra, Lion, ANt]
After sorting (Descending): [Zebra, Lion, Bear, ANt]
 */