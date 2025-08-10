package Arrays_Programs;

import java.util.Scanner;

public class ArrayUtility{
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of the Array : ");
        int size = input.nextInt();

        int[] numArr = new int[size];
        int i=0;
        while(i<size){
            System.out.printf("Enter the element num %d : ",(i+1));
            numArr[i] = input.nextInt();
            i++;
        }
        return numArr;
    }

    public static void displayArray(int[] numArr){
        int i=0;
        while(i<numArr.length){
            System.out.print(numArr[i] + " ");
            i++;
        }
    }

//    public static int[][] input2DArray(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the num of rows: ");
//        int rows = input.nextInt();
//
//        System.out.println("Now, enter the no of columns: ");
//        int columns = input.nextInt();
//
//        int[][] numArr = new int[rows][columns];
//
//        int i=0;
//        while(i<rows){
//            int j=0;
//            while(j<columns){
//                System.out.printf("Enter the element of row %d and column %d : ",(i+1),(j+1));
//                j++;
//            }
//            i++;
//        }
//        return numArr;
//    }
}