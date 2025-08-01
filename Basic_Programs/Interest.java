import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Principle Amount: ");
        int P = input.nextInt();
        System.out.print("Now tell me your rate of interest: ");
        float R = input.nextFloat();
        System.out.print("Now, tell me for how many years are you borrowing: ");
        float T = input.nextFloat();
        SimpleInterest(P,R,T);
        CompoundInterest(P,R,T);
    }
    public static void SimpleInterest(int P, float R, float T){
        double SI = (P*R*T)/100;
        System.out.printf("Simple Interest is: %.2f",SI);
        System.out.println("----------");
    }

    public static void CompoundInterest(int P, float R, float T){
        double CI = P*Math.pow((1+R/100),T);
        System.out.printf("Compound Interest is: %.2f",CI);
    }
}
