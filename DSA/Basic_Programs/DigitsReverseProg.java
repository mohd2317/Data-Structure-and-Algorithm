package Basic_Programs;

import java.util.Scanner;
public class DigitsReverseProg{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Digits: ");
        int num = input.nextInt();
        System.out.print("Enter a floating-point number: ");
        String numStr = input.nextLine();
        int reverse = reverse(num);
        String StrReverse = reverseDigitsAsString(num);
        String reversed = reverseFloat(numStr);
        System.out.printf("Your reverse Digits are: %d\n",reverse);
        System.out.printf("Your reverse Digits are: %s\n",StrReverse);
        System.out.printf("Reversed Digits: %s\n", reversed);
    }
    public static int reverse(int num){
        int newNum = 0;
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum * sign;
    }

    public static String reverseDigitsAsString(int num){
        String str = Integer.toString(num);
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String reverseFloat(String numStr) {
        boolean isNegative = numStr.startsWith("-");
        if (isNegative) numStr = numStr.substring(1);

        String[] parts = numStr.split("\\.");
        String intPart = parts[0];
        String fracPart = parts.length > 1 ? parts[1] : "";

        String reversedInt = new StringBuilder(intPart).reverse().toString();
        String reversedFrac = new StringBuilder(fracPart).reverse().toString();

        String result = reversedFrac + "." + reversedInt;
        return isNegative ? "-" + result : result;
    }
}
