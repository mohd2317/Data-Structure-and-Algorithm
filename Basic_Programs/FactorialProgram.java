import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number to calculate factorial: ");
        int num = input.nextInt();

        // Handle edge cases
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        int factRecursive = factorialRecursive(num);
        int factIterative = factorialIterative(num);

        // Print results with context
        System.out.println("Recursive factorial of " + num + " is: " + factRecursive);
        System.out.println("Iterative factorial of " + num + " is: " + factIterative);
    }

    // Recursive method
    public static int factorialRecursive(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorialRecursive(num - 1);
    }

    // Iterative method
    public static int factorialIterative(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}

//Time Complexity:O(n)
// factorialRecursive(int num)
//Each recursive call reduces num by 1 until it reaches 0 or 1.
//So, for input n, it makes n recursive calls.

// factorialIterative(int num)
//Uses a for loop from 2 to n, performing one multiplication per iteration.

//Space Complexity
// factorialRecursive(int num):O(n)
//Each recursive call adds a new frame to the call stack.
//So, for input n, it uses n stack frames.

//factorialIterative(int num):O(1)
//Uses a few variables (fact, i) and no recursion.