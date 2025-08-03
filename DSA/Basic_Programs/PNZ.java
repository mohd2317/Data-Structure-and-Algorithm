package Basic_Programs;

import java.util.Scanner;
public class PNZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the num: ");
        int num = input.nextInt();
        String result = num > 0 ? "Positive" : (num == 0 ? "Zero" : "Negative");
        System.out.print(result);
    }
}

//Time Complexity O(1)
//Reading input: nextInt() → O(1)
//Ternary condition checks → O(1)

//Space Complexity O(1)
//One Scanner object
//One int variable (num)
//One String variable (result)