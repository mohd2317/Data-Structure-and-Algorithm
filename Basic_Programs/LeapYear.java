import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the year that you want to check: ");
        int year = input.nextInt();
        if (year <= 0) {
            System.out.println("Please enter a valid positive year.");
        }
        else if(year%400 == 0 || (year%4==0 && year%100 != 0)){
            System.out.print("Your entered year is a Leap Year.");
        }else{
            System.out.print("Not a Leap Year.");
        }
    }
}

//Time Complexity O(1)
//The program performs:
//A single input read (nextInt()): O(1)
//A few arithmetic operations (%, ==, !=) and conditional checks: O(1)
//
//There are no loops or recursive calls, so the time complexity is:O(1)

//Space Complexity O(1)
//The program uses:
//One Scanner object
//One int variable (year)
//
//No dynamic data structures or memory allocations based on input size. Space Complexity: O(1)