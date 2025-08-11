package String_Programs;

import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        System.out.println("Welcome to white space remove program.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String str = input.nextLine();
        char[] chars = str.toCharArray();

        String result = "";

        for (char aChar:chars){
            if (aChar != ' '){
                result+=aChar;
            }
        }
        System.out.println("String without white spaces: "+result);
    }
}

//RemoveWhiteSpace program works fine for removing spaces,but it currently only removes normal spaces (' ')
// — it won’t handle tabs (\t), newlines (\n), or multiple different kinds of whitespace.

//a more efficient and flexible version using StringBuilder and Character.isWhitespace()
// so it can handle all whitespace types.
/*
StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
        if (!Character.isWhitespace(c)) { // removes space, tab, newline, etc.
        result.append(c);
            }
                    }
*/