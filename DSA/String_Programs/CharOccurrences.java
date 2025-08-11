package String_Programs;

import java.util.Scanner;

public class CharOccurrences {
    public static void main(String[] args) {
        System.out.println("Welcome to Char Occurrences Program.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String str = input.nextLine();

        System.out.println("Now, enter a char that you want to found: ");
        char target = input.next().charAt(0);
        char[] chars = str.toCharArray();

//        int count=0;
//        for (char c : chars) {
//            if (c==target){
//                count++;
//            }
//        }

        long count = str.chars() // creates an IntStream of character codes
                .filter(ch -> ch == target)
                .count();
        System.out.printf("Your char %c was found in %d times.",target,count);
    }
}

//Advantages:
//No manual loop.
//Works directly on Unicode code points.
//Cleaner for short programs.
