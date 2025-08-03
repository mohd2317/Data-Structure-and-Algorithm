package Basic_Programs;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the num: ");
        int num = input.nextInt();
        String result = (num&1)==1 ? "Odd Num" : "Even Num";
        System.out.printf("Your num is: %s",result);
        //num&1, if LSB of num is 1 the result is 1 (odd)
        //       if LSB of num is 0 the result is 0 (even)
        // 00000111
        // &00000001
        // = 00000001
        // AND & if both bits are 1&1 = 1
    }
}

//Time Complexity: O(1)
//Reading input: nextInt() → O(1)
//Bitwise operation → O(1)

//Space Complexity: O(1)
//One Scanner object
//One int variable (num)
//One String variable (result)