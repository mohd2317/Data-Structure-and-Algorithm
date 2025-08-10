package Arrays_Programs;

import java.util.Scanner;
public class SearchingArrEmt{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numArr = {1,2,3,4,5,6,7,8,9};

        System.out.println("Welcome to Array Searching.");
        System.out.println("Enter the num you want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(numArr,num);
        if (isFound){
            System.out.println("Your num was found in the array.");
        }else {
            System.out.println("Your num was not found.");
        }
    }
    public static boolean isFound(int[] numArr, int num){
//        return Arrays.stream(numArr).anyMatch(e -> e == num);
        for (int elements:numArr){
            if (elements==num){
                return true;
            }
        }
        return false;
    }
}