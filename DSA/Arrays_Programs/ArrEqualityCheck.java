package Arrays_Programs;

import java.util.Arrays;

public class ArrEqualityCheck {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = {10, 20, 30};

        boolean equal = Arrays.equals(a, b);
        System.out.println("(Java 7) Arrays Equal? " + equal);
    }
}

//Java 7 way: Arrays.equals(a, b)
//
//Java 8 way: Uses Streams with allMatch() and anyMatch() to compare elements.