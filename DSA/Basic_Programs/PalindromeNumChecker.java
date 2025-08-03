package Basic_Programs;

import java.util.Scanner;
public class PalindromeNumChecker{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the num: ");
        int num = input.nextInt();
        boolean isPalin = isPalin(num);
        if(isPalin){
            System.out.print("Your num is a Palindrome number.");
        }else{
            System.out.print("Not a Palindrome.");
        }
    }
    public static boolean isPalin(int num){
        return num == reverse(num);
    }
    public static int reverse(int num){
        int newNum=0;
        while(num>0){
            int digit = num%10;
            newNum = newNum*10+digit;
            num/=10;
        }
        return newNum;
    }
}

//Time Complexity
//Assume num has n digits.
//reverse(num) loops once per digit → O(n)
//isPalin(num) calls reverse(num) and compares → O(n)
//Since the number of digits n is proportional to log₁₀(num), we can express time complexity as: O(log₁₀(n)) → O(log n)

//Space Complexity:O(1)
//Uses a few primitive variables: newNum, digit, num
//No recursion or dynamic structures