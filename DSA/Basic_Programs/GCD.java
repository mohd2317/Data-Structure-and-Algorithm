package Basic_Programs;

import java.util.Scanner;
public class GCD{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first num: ");
        int first = input.nextInt();
        System.out.print("Now, enter the second num: ");
        int second = input.nextInt();
        int gcd = gcd(first,second);
        System.out.printf("Your gcd is: %d",gcd);
        int gcdEA = gcdEuclideanAlgo(first,second);
        System.out.printf("Your gcd is: %d",gcdEA);
    }
    public static int gcd(int first, int second){
        int gcd = 1;
        int i=2;
        int least = least(first,second);
        while(i<=least){
            if(first%i==0 && second%i==0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2){
        return Math.max(num1, num2); //(num1>num2)? num1:num2;
    }

    public static int gcdEuclideanAlgo(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

//Time Complexity
//Current (Brute-force):Time Complexity: O(max(a, b))
//Loops from 2 to max(first, second)

//Improved (Euclidean):Time Complexity: O(log min(a, b))

//Space Complexity:O(1)
//Uses a few primitive variables
//No recursion or dynamic structures
