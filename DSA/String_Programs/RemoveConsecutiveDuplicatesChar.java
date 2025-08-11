package String_Programs;

import java.util.Scanner;

public class RemoveConsecutiveDuplicatesChar {
    public static void main(String[] args) {
        System.out.println("Welcome to Remove Consecutive duplicates char from the string program.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String str = input.nextLine();
        char[] chars = str.toCharArray();
        String result = "";

        for (int i=0; i< chars.length; i++){
            if (i==0 || chars[i] != chars[i-1]){
                result += chars[i];
            }
        }
        System.out.println("Modified String after removing consecutive duplicates: "+result);
    }
}

//If it's the first character (i == 0) OR it's different from the previous one, append it to result.