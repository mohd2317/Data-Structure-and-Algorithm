import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the no up to which series want u print: ");
        int num = input.nextInt();
        System.out.println("Here is the Fibonacci series: ");
        fibonacci(num);
    }
    public static void fibonacci(int num){
        if(num<0) return;
        System.out.print("0 ");

        if(num<1) return;
        System.out.print("1 ");

        int first=0, second=1;
        while(first+second<=num){
            int third = first + second;
            System.out.print(third +" ");
            first = second;
            second = third;
        }
    }
}



//Time Complexity:O(log num)
//Let’s say the Fibonacci sequence has k terms up to num.
//Each iteration computes one term → O(1)
//Total iterations ≈ number of Fibonacci terms ≤ num
//Fibonacci numbers grow exponentially, so the number of terms is roughly:𝑘≈log⁡𝜙(𝑛𝑢𝑚)where 𝜙≈1.618

//Space Complexity:O(1)
//Uses a few primitive variables: first, second, third
//No recursion or dynamic structures