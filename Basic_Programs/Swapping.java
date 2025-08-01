public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a,b);
        swaps(a,b);
        swapsXOR(a,b);
    }
    public static void swap(int a, int b){
        System.out.printf("Before Swapping value of a = %d and b = %d",a,b);
        int swap = a;
        a = b;
        b = swap;
        System.out.printf("\n After Swapping Value of a = %d and b = %d",a,b);
    }

    public static void swaps(int a, int b){
        System.out.printf("\nBefore Swapping value of a = %d and b = %d",a,b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.printf("\n After Swapping Value of a = %d and b = %d",a,b);
    }

    public static void swapsXOR(int a,int b){ // a=10=1010  b=20=10100
        System.out.printf("\nBefore Swapping value of a = %d and b = %d",a,b);
        a=a^b; // 01010^10100 = 11110 =30
        b=a^b; // 11110^10100 = 01010 =10
        a=a^b; // 11110^01010 = 10100 =20
        System.out.printf("\n After Swapping Value of a = %d and b = %d",a,b);

        // x^x = 0 Any number of XOR itself is 0
        // x^0 = x Any number XOR 0 is the number itself
        // x^y^x = y Order of XOR operations does not matter
    }
}
