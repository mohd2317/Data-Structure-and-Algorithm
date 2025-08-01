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
