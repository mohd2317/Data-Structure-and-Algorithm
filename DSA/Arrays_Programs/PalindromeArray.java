package Arrays_Programs;

import java.util.stream.IntStream;

public class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Array Checker.");
        int[] numArr = ArrayUtility.inputArray();
        boolean isPalindrome = isPalindrome(numArr);
        if (isPalindrome){
            System.out.println("Your Array is Palindrome.");
        }else {
            System.out.println("Not a Palindrome.");
        }

        // --- Java 8 Approach ---
        boolean isPalindrome8 = isPalindromeJava8(numArr);
        System.out.println("Java 8 - " + (isPalindrome8 ? "Palindrome" : "Not a Palindrome"));
    }
    public static boolean isPalindrome(int[] numArr){
        int i=0;
        while (i< numArr.length/2){
            if (numArr[i] != numArr[(numArr.length-1)-i]){
                return false;
            }
            i++;
        }
        return true;
    }


    // -------- Java 8 Method --------
    public static boolean isPalindromeJava8(int[] numArr) {
        return IntStream.range(0, numArr.length / 2)
                .allMatch(i -> numArr[i] == numArr[numArr.length - 1 - i]);
    }
}
