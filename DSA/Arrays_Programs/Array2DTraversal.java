package Arrays_Programs;

public class Array2DTraversal {
    public static void main(String[] args) {
        int[][] numArr = {{},{1,2,},{1,2,3}};
        System.out.println(numArr.length);
        System.out.println(numArr[0].length);
        System.out.println(numArr[1].length);

        int i=0;
        while (i<numArr.length){
            int j=0;
            while (j<numArr[i].length){
                System.out.println(numArr[i][j]+"");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
