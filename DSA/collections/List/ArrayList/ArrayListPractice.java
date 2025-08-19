package collections.List.ArrayList;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListPractice {
    public static void main(String[] args) {

        //Create and Print
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        System.out.println("Create & Print: " + list);

        //Sort Asc & Desc
        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));
        Collections.sort(nums);
        System.out.println("Ascending: " + nums);
        nums.sort(Collections.reverseOrder());
        System.out.println("Descending: " + nums);

        //Search Element
        String key = "B";
        System.out.println("Search: " + key + (list.contains(key) ?
                " found at index " + list.indexOf(key) : " not found"));

        //Remove Duplicates
        List<Integer> numsWithDup = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        List<Integer> unique = new ArrayList<>(new LinkedHashSet<>(numsWithDup));
        System.out.println("Unique collections.List: " + unique);

        //Merge Two Lists
        List<String> list1 = new ArrayList<>(Arrays.asList("A", "B"));
        List<String> list2 = new ArrayList<>(Arrays.asList("C", "D"));
        list1.addAll(list2);
        System.out.println("Merged collections.List: " + list1);

        //Reverse
        List<Integer> reverseList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Collections.reverse(reverseList);
        System.out.println("Reversed: " + reverseList);

        //Max & Min
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(10, 20, 5, 25, 15));
        int max = Collections.max(nums2);
        int min = Collections.min(nums2);
        System.out.println("Max: " + max + ", Min: " + min);

        //Custom Sort by Length
        List<String> names = new ArrayList<>(Arrays.asList("John", "Alex", "Bob"));
        names.sort(Comparator.comparingInt(String::length));
        System.out.println("Sorted by length: " + names);

        //Filter using Streams
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        List<Integer> filtered = numbers.stream()
                .filter(n -> n > 20)
                .collect(Collectors.toList());
        System.out.println("Filter > 20: " + filtered);

        //Convert collections.List ↔ Array
        String[] arr = list.toArray(new String[0]);
        System.out.println("collections.List → Array: " + Arrays.toString(arr));

        String[] data = {"X", "Y", "Z"};
        List<String> fromArray = new ArrayList<>(Arrays.asList(data));
        System.out.println("   Array → collections.List: " + fromArray);
    }
}
