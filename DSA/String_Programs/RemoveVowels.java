package String_Programs;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        System.out.println("Welcome to Vowels Remove from the String Program.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String str = input.nextLine();
        char[] chars = str.toCharArray();

        String result = "";
        for (char aChar : chars) {
            if (aChar != 'a' && aChar != 'e' && aChar != 'i' && aChar != 'o' && aChar != 'u' &&
                    aChar != 'A' && aChar != 'E' && aChar != 'I' && aChar != 'O' && aChar != 'U') {
                result += aChar;
            }
        }
        System.out.println("String without Vowels: "+result);
    }
}

//result += aChar;
//which is inefficient in loops because it creates new String objects each time.
//You can make it more efficient using a StringBuilder:
/*

        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!isVowel(c)) {
                result.append(c);
            }


        System.out.println("String without Vowels: " + result);
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
*/