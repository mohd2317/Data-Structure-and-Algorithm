import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first num: ");
        int first = input.nextInt();
        System.out.print("Now, enter the second num: ");
        int second = input.nextInt();
        int lcm = lcm(first, second);
        System.out.printf("Your LCM is: %d ", lcm);
    }

    public static int lcm(int first, int second) {
        int i = 1;
        while (true) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }

//        int i=0;
//        while(i<=second){  LCM(6, 14) is 42, but 6 * 7 = 42, and i = 7 exceeds second.
//            int factor=first*i;
//            if(factor%second==0){
//                return factor;
//            }
//            i++;
//        }
//        return 0; //unreachable
    }

}
//        public static int gcd(int a, int b){
//            while(b != 0){
//                int temp = b;
//                b = a % b;
//                a = temp;
//            }
//            return a;
//        }
//
//        public static int lcm(int a, int b){
//            return (a * b) / gcd(a, b);

//It keeps replacing a with b, and b with a % b (the remainder).
//When b becomes 0, a holds the GCD.
//    Step 1: a = 48, b = 18 → a % b = 12
//    Step 2: a = 18, b = 12 → a % b = 6
//    Step 3: a = 12, b = 6 → a % b = 0
//    Done! GCD = 6
//GCD(a, b) = GCD(b, a % b)
//𝑎×𝑏=GCD(𝑎,𝑏)×LCM(𝑎,𝑏)
//gcd(int a, int b) — Euclidean Algorithm

//Time Complexity
//Brute-force method:Time Complexity: O(second)
//Worst case: up to second iterations
//Each iteration: O(1)

//GCD-based method:Time Complexity: O(log min(a, b))
//GCD using Euclidean algorithm: O(log min(a, b))
//LCM: O(1) after GCD

//Space Complexity:Space Complexity: O(1)
//Uses a few primitive variables
//No recursion or dynamic structures