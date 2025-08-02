import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input principal, rate, and time
        System.out.print("Please enter the Principal Amount: ");
        double P = input.nextDouble();

        System.out.print("Now tell me your Rate of Interest (in %): ");
        double R = input.nextDouble();

        System.out.print("Now, tell me for how many Years are you borrowing: ");
        double T = input.nextDouble();

        // Calculate and display Simple Interest
        double SI = (P * R * T) / 100;
        double totalSI = P + SI;
        System.out.printf("\nSimple Interest is: %.2f\n", SI);
        System.out.printf("Total Amount with Simple Interest: %.2f\n", totalSI);
        System.out.println("----------");

        // Calculate and display Compound Interest
        double CI = P * Math.pow((1 + R / 100), T);
        System.out.printf("Compound Interest is: %.2f\n", CI - P); // Optional: show only interest part
        System.out.printf("Total Amount with Compound Interest: %.2f\n", CI);
    }
}

//Time Complexity:O(1)
//The program performs:
//Three user inputs (nextDouble()) → O(1) each
//Simple Interest calculation → basic arithmetic → O(1)
//Compound Interest calculation → uses Math.pow() → O(1)
//Printing results → O(1)

//Space Complexity:O(1)
//The program uses:
//Primitive variables: double P, R, T, SI, CI, totalSI, totalCI → constant space
//One Scanner object → constant space