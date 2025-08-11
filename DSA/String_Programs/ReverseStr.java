package String_Programs;

import java.util.Scanner;
/*
public class ReverseStr {
    public static void main(String[] args) {
        System.out.println("Welcome String Reverse Program.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your String: ");
        String str = input.nextLine();
        char[] chars = str.toCharArray();
        String reversedStr = "";

        for(int i= chars.length-1; i>=0; i--) {
            reversedStr += chars[i];
        }

        System.out.println("Reversed String is: "+reversedStr);
    }
}
*/

public class ReverseStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = input.nextLine();
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char swap = chars[start];
            chars[start] = chars[end];
            chars[end] = swap;

            start++;
            end--;
        }

        String reversedStr = new String(chars);
        System.out.println(reversedStr);
    }
}


//1. First Version (String Concatenation)
//Pros: Simple to understand.
//Cons: Inefficient for long strings because String is immutable — every += creates a new object in memory.
// Better: Use StringBuilder instead:

//StringBuilder reversed = new StringBuilder();
//for (int i = chars.length - 1; i >= 0; i--) {
//        reversed.append(chars[i]);
//}
//        System.out.println("Reversed String is: " + reversed);

//2. Second Version (In-place Swap)
//Pros: Memory-efficient, works in-place, fast for large strings.
//Cons: Slightly more logic to understand.