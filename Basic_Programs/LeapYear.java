import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the year that you want to check: ");
        int year = input.nextInt();
        if(year%400 == 0 || (year%4==0 && year%100 != 0)){
            System.out.print("Your entered year is a Leap Year.");
        }else{
            System.out.print("Not a Leap Year.");
        }
    }
}