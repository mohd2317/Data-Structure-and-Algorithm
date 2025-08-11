package String_Programs;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("Welcome to Duplicates Char Remove from the String.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String str = input.nextLine();
        char[] chars = str.toCharArray();

        String result = "";
        for (int i = 0; i < chars.length; i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (chars[i] == chars[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result += chars[i];
            }
        }
        System.out.println("String after removing duplicates: " + result);
    }
}
//Improvements
//1. Use StringBuilder instead of +=
//String concatenation (result += chars[i]) creates a new String object each time, which is inefficient.
//A StringBuilder avoids this overhead.
/*
StringBuilder result = new StringBuilder();
for (int i = 0; i < chars.length; i++) {
boolean found = false;
    for (int j = 0; j < i; j++) {
        if (chars[i] == chars[j]) {
found = true;
        break;
        }
        }
        if (!found) {
        result.append(chars[i]);
    }
            }
            System.out.println("String after removing duplicates: " + result.toString());
*/