package List.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyCount {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,3,4,5,1);
        System.out.println("Frequency of element is: " + Collections.frequency(list, 1));
    }
}

//Time complexity → O(n) (because it scans the whole list once)
