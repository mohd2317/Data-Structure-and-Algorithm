package Basic_Programs;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the num: ");
        int num = input.nextInt();

        System.out.printf("OddSum till %d is: %d\n", num, OddSumW(num));
        System.out.printf("OddSumF till %d is: %d\n", num, OddSumF(num));
    }

    public static int OddSumW(int num) {
        int sum = 0;
        int i = 0;
        while (i <= num) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }

    public static int OddSumF(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i += 2) {
            sum += i;
        }
        return sum;
    }
}
//Method 1:OddSum(int num)
//Time Complexity: O(n)
//The loop runs from i = 0 to i <= num, incrementing by 1.
//For each iteration, it checks if i, is odd and adds it to sum if true.
//
//Space Complexity: O(1)
//Uses a constant amount of space: sum, i, and num.


//Method 2: OddSumF(int num)
//Time Complexity: O(n) Technically O(n/2), but constants are dropped in Big-O notation.
//The loop runs from i = 1 to i <= num, incrementing by 2.
//This means it runs approximately n/2 times.
//
//Space Complexity: O(1)
//Also uses a constant amount of space: sum, i, and num.
