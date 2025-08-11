package String_Programs;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        System.out.println("Welcome to Vowels count in the String.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your String: ");
        String str = input.nextLine();
        char[] chars = str.toCharArray();

        int vowelsCount = 0;
        for (char c:chars){
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
                c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){

                vowelsCount++;
            }
        }
        System.out.println("Vowels in the String is: "+vowelsCount);
    }
}
//long vowelsCount = str.chars()
//        .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
//        .count();
