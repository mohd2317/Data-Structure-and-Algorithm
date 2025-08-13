package List.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list);

        reverseList(list);
        System.out.println(list); //[5, 4, 3, 2, 1]
    }

    public static void reverseList(List <Integer> list){
//        Collections.reverse(list);
        for (int i=0; i< list.size()/2; i++){
            ListSwap.swap(list, i, list.size()-1-i);
        }
    }
}
