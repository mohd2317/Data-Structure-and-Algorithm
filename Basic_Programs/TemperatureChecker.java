import java.util.Scanner;

public class TemperatureChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the temperature in Fahrenheit: ");
        float F = input.nextFloat();

        float Temp = (F-32)*5.0f/9.0f;
        System.out.printf("Temperature in Celsius: %f",Temp);
    }
}
