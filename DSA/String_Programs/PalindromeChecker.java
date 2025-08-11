package String_Programs;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome String Checker.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = input.nextLine();
        char[] chars = str.toCharArray();

        boolean isPalindrome = true;

        for (int i=0; i< chars.length/2; i++){
            if (chars[i] != chars[(chars.length-1)-i]){
                isPalindrome=false;
                break;
            }
        }
//        boolean isPalindrome = IntStream.range(0, str.length() / 2)
//                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
        System.out.println("Your String is: " + (isPalindrome ? "Palindrome":"Not a Palindrome"));
    }
}

//Key differences:
//Uses IntStream.range() to loop from 0 to length/2.
//allMatch returns true only if all character comparisons match.
//Fewer lines, still easy to read.