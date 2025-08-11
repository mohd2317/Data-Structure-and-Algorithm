package String_Programs;

import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args) {
        System.out.println("Welcome to Replace char from the String Program.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String str = input.nextLine();

        System.out.println("Now, enter the char to replace: ");
        char oldChar = input.next().charAt(0);

        System.out.println("Now, enter the replacement char: ");
        char newChar = input.next().charAt(0);

        char[] chars = str.toCharArray();
        String result = "";

        for (char aChar : chars) {
            if (aChar == oldChar) {
                result += newChar;
            } else {
                result += aChar;
            }
        }
//        String result = str.replace(oldChar, newChar);
        System.out.println("Modified String: "+result);
    }
}

//Efficiency – Instead of repeatedly concatenating strings (result += aChar),
// use a StringBuilder (faster and memory-friendly).
//
//Built-in Methods – For simple replacement, Java provides String.replace(char, char),
// which makes the code shorter and cleaner.
/*
StringBuilder result = new StringBuilder();

        for (char aChar : str.toCharArray()) {
        if (aChar == oldChar) {
        result.append(newChar);
            } else {
                    result.append(aChar);
            }
                    }
*/