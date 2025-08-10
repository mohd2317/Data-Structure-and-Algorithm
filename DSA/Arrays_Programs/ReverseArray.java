package Arrays_Programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reversal.");
        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("Here is the Reversed Array.");
        ArrayUtility.displayArray(numArr);

        // Java 8 Approach
        int[] arr8 = Arrays.copyOf(numArr, numArr.length);
        arr8 = reverseJava8(arr8);
        System.out.println("\n Reversed Array: " + Arrays.toString(arr8));
    }
    public static void reverse(int[] numArr){
        int i=0;
        while (i< numArr.length/2){
            int swap = numArr[i];
            numArr[i] = numArr[(numArr.length-1)-i];
            numArr[(numArr.length-1)-i] = swap;
            i++;
        }
    }


    // -------- Java 8 Method --------
    public static int[] reverseJava8(int[] numArr) {
        return IntStream.rangeClosed(1, numArr.length)
                .map(i -> numArr[numArr.length - i])
                .toArray();
    }
}

//How It Works
//Java 7 → Classic swapping technique using while loop.
//
//Java 8 → Uses IntStream.rangeClosed() to map elements from the end to the start.