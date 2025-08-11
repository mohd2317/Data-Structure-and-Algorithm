package String_Programs;

import java.util.Scanner;

public class StrLength {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculate String Length.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String str = input.nextLine();
        char[] chars = str.toCharArray();

        int length = 0;
        for (char c:chars){
            length++;
        }
        System.out.println("Your String length is: "+length);
    }
}
//long length = str.chars().count();
//System.out.println("Your String length is: " + length);