package collections.Map;

import java.util.*;
import java.util.stream.Collectors;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // put, putIfAbsent
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.putIfAbsent(2, "Blueberry"); // won't overwrite
        System.out.println("Initial Map: " + map); //{1=Apple, 2=Banana, 3=Cherry}

        // get, getOrDefault
        System.out.println("Get key 2: " + map.get(2)); ////Banana
        System.out.println("GetOrDefault (key 5): " + map.getOrDefault(5, "Not Found")); //Not found

        // containsKey, containsValue
        System.out.println("Contains Key 1? " + map.containsKey(1)); //true
        System.out.println("Contains Value 'Mango'? " + map.containsValue("Mango")); //f

        // remove
        map.remove(3);
        System.out.println("After remove key 3: " + map); //{1=Apple, 2=Banana}

        // replace
        map.replace(2, "Banana", "Blackberry"); // conditional replace
        map.replace(1, "Pineapple"); // unconditional replace
        System.out.println("After replace: " + map); //{1=Pineapple, 2=Blackberry}

        // size, isEmpty
        System.out.println("Size: " + map.size() + ", isEmpty: " + map.isEmpty()); //2 f

        // ===== Iteration in Java 7 =====
        System.out.println("\n--- Iteration Java 7 ---");

        // 1. keySet()
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + " Value: " + map.get(key)); // Key: 1 Value: Pineapple Key: 2 Value: Blackberry
        }

        // 2. entrySet()
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Entry: " + entry.getKey() + " -> " + entry.getValue());
        }

        // 3. Iterator
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> e = it.next();
            System.out.println("Iterator: " + e.getKey() + " => " + e.getValue());
        }

        // ===== Iteration in Java 8 =====
        System.out.println("\n--- Iteration Java 8 ---");

        // forEach with lambda
        map.forEach((k, v) -> System.out.println("forEach: " + k + " -> " + v));

        // stream + map
        map.entrySet().stream()
                .map(e -> e.getKey() + ":" + e.getValue().toUpperCase())
                .forEach(System.out::println);

        // collect values into list
        List<String> valuesList = map.values().stream().collect(Collectors.toList());
        System.out.println("Values List: " + valuesList); //[Pineapple, Blackberry]

        // computeIfAbsent
        map.computeIfAbsent(5, k -> "Orange");
        System.out.println("After computeIfAbsent: " + map); //{1=Pineapple, 2=Blackberry, 5=Orange}

        // merge
        map.merge(2, " Fruit", (oldVal, newVal) -> oldVal + newVal);
        System.out.println("After merge: " + map);

        // ===== Access Order Example =====
        LinkedHashMap<Integer, String> accessOrderMap =
                new LinkedHashMap<>(16, 0.75f, true); // true = access-order This means the map will reorder entries based on access order (get/put).
        accessOrderMap.put(1, "One");
        accessOrderMap.put(2, "Two");
        accessOrderMap.put(3, "Three");

        // Access some keys
        accessOrderMap.get(1); //Key 1 is accessed → It moves to the end (most recently used). Order now: {2=Two, 3=Three, 1=One}
        accessOrderMap.get(3); //accessOrderMap.get(3); Key 3 is accessed → It moves to the end. Order now: {2=Two, 1=One, 3=Three}

        System.out.println("Access Order Map: " + accessOrderMap); //{2=Two, 1=One, 3=Three}
    }
}
