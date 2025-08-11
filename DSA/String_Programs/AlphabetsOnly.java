package String_Programs;

import java.util.Scanner;

public class AlphabetsOnly {
    public static void main(String[] args) {
        System.out.println("Welcome to Alphabets Only in the String Program.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String str = input.nextLine();
        char[] chars = str.toCharArray();

        boolean isAlphabet = true;

        for (char aChar:chars){
            if (!((aChar>='a' && aChar<='z') || (aChar>='A' && aChar<='Z'))){
                isAlphabet = false;
                break;
            }
        }
        System.out.println(isAlphabet?"The String contains only alphabetic character":"Contains non-alphabetic char");


        // ===== Java 8 Style - Using Streams =====
        boolean isAlphabetJava8 = str.chars()
                .allMatch(Character::isLetter);
        System.out.println("(Java 8) " + (isAlphabetJava8 ? "The String contains only alphabetic characters" : "Contains non-alphabetic characters"));
    }
}


//Kept your manual char checking loop for Java 7.
//
//Added Java 8 approach using:
//str.chars() → converts String to IntStream.
//Character::isLetter → method reference to check if each character is a letter.