package Basic_Programs;

import java.util.Scanner;

public class TemperatureChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature Checker Program..");
        System.out.print("Enter 'C' to convert to Celsius or 'F' to convert to Fahrenheit: ");
        char choice = input.next().toUpperCase().charAt(0);
        if (choice == 'C') {
            System.out.print("Enter temperature in Fahrenheit: ");
            float f = input.nextFloat();
            float c = (f - 32) * 5.0f / 9.0f;
            System.out.printf("Temperature in Celsius: %.2f\n", c);
        } else if (choice == 'F') {
            System.out.print("Enter temperature in Celsius: ");
            float c = input.nextFloat();
            float f = (c * 9.0f / 5.0f) + 32;
            System.out.printf("Temperature in Fahrenheit: %.2f\n", f);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
//Time Complexity: constant, or O(1)
//program performs a constant number of operations:One input read (nextFloat)
//Arithmetic operations: Each temperature conversion formula is O(1).
//Condition checks (if-else): These are O(1).
//One formatted print
//
//None of these operations depend on the size of the input—whether the temperature is 32.0 or 1000000.0, the number of steps remains the same.


//Space Complexity: constant, or O(1)
//program uses a fixed amount of memory:
//One Scanner object
//Two float variables: F and Temp
//No arrays, lists, or dynamic memory allocation based on input size.
