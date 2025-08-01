import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the num which table want you print: ");
        int num = input.nextInt();
        printTable(num);
        tableWhile(num);
    }
    public static void printTable(int num){
        for(int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d\n",num,i,num*i);
        }
    }

    public static void tableWhile(int num){
        int i=1;
        while(i++<=10){ //i=2
            System.out.printf("%d * %d = %d\n",num,i,num*i);
        }
    }
}