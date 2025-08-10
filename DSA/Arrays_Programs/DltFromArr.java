package Arrays_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class DltFromArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion.");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Now, enter the num you want to delete: ");
        int numToDlt = input.nextInt();

        int[] newArr = deleteNum(numArr, numToDlt);
        System.out.println("Here is your new Array.");
        ArrayUtility.displayArray(newArr);

        // --- Java 8 Method ---
        int[] newArrJava8 = deleteNum8(numArr, numToDlt);
        System.out.println("New Array (Java 8): " + Arrays.toString(newArrJava8));
    }

    public static int[] deleteNum(int[] numArr, int numToDlt) {
//        int occurrences = NumOfOcc.numOfOcc(numArr,numToDlt);
        int occurrences = Occurrences(numArr, numToDlt);
        if (occurrences == 0) {
            return numArr;
        }

        int newSize = numArr.length - occurrences;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numToDlt) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }

    public static int Occurrences(int[] numArr, int num) {
        int occ = 0;
        for (int elements : numArr) {
            if (elements == num) {
                occ++;
            }
        }
        return occ;
    }

    // Delete element from array using Streams (Java 8)
    public static int[] deleteNum8(int[] numArr, int numToDlt) {
        return Arrays.stream(numArr)
                .filter(n -> n != numToDlt)
                .toArray();
    }
}

//Complexity
//Java 7: O(n) time, O(n) space
//
//Java 8: O(n) time, O(n) space