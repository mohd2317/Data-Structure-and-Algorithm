package Arrays_Programs;

import java.util.Scanner;
import java.util.Arrays;

public class ArrSumAvg {
    public static void main(String[] args) {
        System.out.println("Welcome to Arrays Sum & Avg..");
        int[] numArr = inputArray();

        // Using traditional methods
        long sum = sum(numArr);
        double avg = avg(numArr);

        System.out.printf("Sum of the numbers is: %d\n", sum);
        System.out.printf("Avg of the numbers is: %.2f\n", avg);

        // Using Java 8 Streams
        long streamSum = Arrays.stream(numArr).sum();
        double streamAvg = Arrays.stream(numArr).average().orElse(0);

        System.out.printf("Sum using Streams: %d\n", streamSum);
        System.out.printf("Avg using Streams: %.2f\n", streamAvg);
    }


    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] numArr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numArr[i] = input.nextInt();
        }
        return numArr;
    }

    public static long sum(int[] numArr) {
        long sum = 0;
        for (int element : numArr) {
            sum += element;
        }
        return sum;
    }

    public static double avg(int[] numArr) {
        long sum = sum(numArr);
        return (double) sum / numArr.length;
    }
}


//Complexity Analysis
//Time Complexity: O(n) (Traverses the array once for sum and average)

//Space Complexity: O(1) (Only uses a few extra variables)