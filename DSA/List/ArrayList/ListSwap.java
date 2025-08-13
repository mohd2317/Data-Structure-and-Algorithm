//Write a method that swap two elements in an AL given their indices.
package List.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ListSwap {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(list);

        swap(list,4,3);
        System.out.println(list); //[1, 2, 3, 5, 4, 6, 7]
    }

    public static void swap(List <Integer> list, int x, int y){
        int swap = list.get(x);
        list.set(x, list.get(y));
        list.set(y, swap);
    }
}
