package String_Programs;

import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        System.out.println("Welcome to Lower to Upper case Converter.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = input.nextLine();
        char[] chars = str.toCharArray();

        String result = "";

        for (char c : chars) {
            if (c >= 'a' && c <= 'z') {
                result += (char) (c - 32);
            } else {
                result += c;
            }
        }
        // Java 8 simple way
//        String result = str.toUpperCase();
        System.out.println("Uppercase String is: "+result);
    }
}
//How it Works
//Takes string input from user.
//Converts it into a char[].
//Loops through each character:
//If it's lowercase ('a' to 'z'), subtracts 32 to get the uppercase ASCII value. — it manually converts lowercase letters to uppercase by subtracting 32 from their ASCII value.
//Otherwise, keeps the character as is.
//Builds a new uppercase string and prints it.