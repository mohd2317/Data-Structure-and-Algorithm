public class AreaOfTriangle {
    public static void main(String[] args) {
        float B = 10;
        float L = 10;

        Area(B,L);
    }

    public static void Area(float B , float L){
        double AOT = 0.5*B*L;
        System.out.printf("Area of Triangle is: %f",AOT);
    }
}
