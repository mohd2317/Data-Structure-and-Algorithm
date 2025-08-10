package Arrays_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class NumOfOcc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrences..");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Now, enter the element you want to find: ");
        int num = input.nextInt();
        int Occurrences = numOfOcc(numArr,num);
        System.out.printf("Your element was found %d times in the array\n.",Occurrences);

        // --- Java 8 Approach ---
        long occJava8 = Arrays.stream(numArr)
                .filter(n -> n == num)
                .count();
        System.out.printf("Your element was found %d times.\n", occJava8);
    }
    public static int numOfOcc(int[] numArr, int num){
        int occ = 0;
        for (int elements:numArr) {
            if (elements==num){
                occ++;
            }
        }
        return occ;
    }
}

//Complexity
//Time Complexity: O(n) for both versions (scans the array once).
//
//Space Complexity: O(1) (Java 7) and O(n) internal buffering for Java 8 Streams.