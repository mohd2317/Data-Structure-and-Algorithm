package Arrays_Programs;

import java.util.Arrays;

public class MaxMinArr {
    public static void main(String[] args) {
        System.out.println("Welcome to Max & Min Elements find in the array..");
        int[] numArr = ArrayUtility.inputArray();
        int min = min(numArr);
        int max = max(numArr);
        System.out.printf("Min element in the array is: %d\n",min);
        System.out.printf("Max element in the array is: %d",max);

        // --- Java 8 Approach ---
        int minJava8 = Arrays.stream(numArr).min().orElse(Integer.MAX_VALUE);
        int maxJava8 = Arrays.stream(numArr).max().orElse(Integer.MIN_VALUE);
        System.out.printf("Java 8 - Min: %d, Max: %d\n", minJava8, maxJava8);
    }
    public static int min(int[] numArr){
        int min = Integer.MAX_VALUE;
        int i=0;
        while (i<numArr.length){
            if (min>numArr[i]){
                min=numArr[i];
            }
            i++;
        }
        return min;
    }
    public static int max(int[] numArr){
        if (numArr.length==0){
            return Integer.MIN_VALUE;
        }
        int max = numArr[0];
        int i=1;
        while (i< numArr.length) {
            if (max<numArr[i]){
                max = numArr[i];
            }
         i++;
        }
        return max;
    }
}


/*
// -------- Java 7 Methods with Enhanced for-each loop --------
public static int minJava7(int[] numArr) {
    int min = Integer.MAX_VALUE;
    for (int num : numArr) {
        if (num < min) {
            min = num;
        }
    }
    return min;
}

public static int maxJava7(int[] numArr) {
    int max = Integer.MIN_VALUE;
    for (int num : numArr) {
        if (num > max) {
            max = num;
        }
    }
    return max;
}

 */