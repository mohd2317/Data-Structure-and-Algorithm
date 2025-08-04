package Arrays_Programs;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] numArr = new int[3];
        //int[] arr = {1,2,3}
        numArr[0] = 1;
        numArr[1] = 2;
        numArr[2] = 3;
        System.out.println(numArr[0]);
        System.out.println(numArr[1]);
        System.out.println(numArr[2]);
        System.out.println("========");

        int index = 0;
        while (index<numArr.length){
            System.out.println(numArr[index]);
            index++;
        }
        System.out.println("========");


        for (int i=0; i<numArr.length; i++){
            System.out.println(numArr[i]);
        }
        System.out.println("========");


        for (int elements:numArr){
            System.out.println(elements);
        }
    }
}
