package String_Programs;

public class BasicProgram {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //false
        System.out.println(s3==s4); //false
        System.out.println(s1.equals(s3)); //true
        System.out.println(s3.equals(s4)); //true
    }
}

//== (reference comparison)
//.equals() (content comparison)