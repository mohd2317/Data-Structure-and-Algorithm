package String_Programs;

import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        System.out.println("Welcome to Most Frequent Char Count Program.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String str = input.nextLine();
        char[] chars = str.toCharArray();

        int maxCount = 0;
        char maxChar = '\0';

        for (int aChar : chars){
            int count=0;
            for (int bChar:chars){
                if (aChar==bChar){
                    count++;
                }
            }
            if (count>maxCount){
                maxCount = count;
                maxChar = (char) aChar;
            }
        }
        System.out.printf("Most Frequent Char %c appeared %d times in the String.",maxChar,maxCount);
    }
}

//Current complexity is O(n²) due to nested loops.

