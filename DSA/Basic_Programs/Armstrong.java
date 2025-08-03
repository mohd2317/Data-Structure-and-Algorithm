package Basic_Programs;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number Checker.");
        System.out.print("Enter a number to check: ");
        int num = input.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            boolean isArmstrong = isArmstrong(num);
            System.out.println(num + " is " + (isArmstrong ? "an Armstrong number." : "not an Armstrong number."));
        }
    }

    public static boolean isArmstrong(int num) {
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNum += pow(lastDigit, noOfDigits);
        }

        return numCopy == finalNum;
    }

    public static int noOfDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }

    public static int pow(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
