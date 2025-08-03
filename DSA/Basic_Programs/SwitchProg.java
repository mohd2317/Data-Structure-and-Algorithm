package Basic_Programs;

import java.util.Scanner;

public class SwitchProg{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to day of the week detection\n");
        System.out.print("Please enter your day in num: ");
        int num = input.nextInt();
        oldSwitch(num);
        EnhancedSwitch(num); //Java 14+
    }

    public static void oldSwitch(int num){
        switch (num){
            case 1:
                System.out.println("Sunday");
                break;
            case 2: System.out.println("Monday");
                break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wed"); break;
            case 5: System.out.println("Thu"); break;

            case 7:
                System.out.println("Sat");
                break;
            case 6:
            case 8:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid Input.");
        }
    }
    public static void EnhancedSwitch(int num) {
        String day = switch (num) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6, 8 -> "Holiday";
            case 7 -> "Saturday";
            default -> "Invalid Input";
        };
        System.out.println(day);
    }

}
