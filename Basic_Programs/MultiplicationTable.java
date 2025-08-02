import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the num which table want you print: ");
        int num = input.nextInt();
        System.out.print("Enter the range: ");
        int range = input.nextInt();
        printTable(num,range);
        tableWhile(num);
    }
    public static void printTable(int num,int range){
        for(int i = 1; i <= range; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num*i);
        }
    }

    public static void tableWhile(int num){
        int i=1;
        while(i++<=10){ //i=2
            System.out.printf("%d * %d = %d\n",num,i,num*i);
        }
    }
}

//Time Complexity: O(10) → O(1)
//Both loops run 10 times

//Space Complexity: O(1)
//One Scanner object
//One int variable (num)
//Loop counters (i) — primitive types