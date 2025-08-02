import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Digits: ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.printf("Sum of digits is: %d",sum);
    }
    public static int sumOfDigits(int num){
        int sum=0;
        while(num>0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }
}

//Time Complexity:𝑂(log10(𝑛)) or simply 𝑂(𝑑)
//Each iteration removes one digit from num using num /= 10.
//So, the number of iterations is proportional to the number of digits in num.
//        Let’s denote:
//𝑑= number of digits in num
//Since a number n has approximately
//log10(𝑛)digits, the loop runs 𝑂(log10(𝑛))times.

//Space Complexity:𝑂(1)
//You're using a constant number of variables: sum, num.
//No recursion, no dynamic memory allocation.