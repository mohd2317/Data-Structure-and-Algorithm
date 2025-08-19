package collections.Map;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapProg {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // put, putIfAbsent
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.putIfAbsent(2, "Blueberry"); // won't overwrite
        System.out.println("Initial Map: " + map); //{1=Apple, 2=Banana, 3=Cherry}

        // get, getOrDefault
        System.out.println("Get key 2: " + map.get(2)); //Banana
        System.out.println("GetOrDefault (key 5): " + map.getOrDefault(5, "Not Found")); //Not found

        // containsKey, containsValue
        System.out.println("Contains Key 1? " + map.containsKey(1)); //true
        System.out.println("Contains Value 'Mango'? " + map.containsValue("Mango")); //false

        // remove
        map.remove(3);
        System.out.println("After remove key 3: " + map); //{1=Apple, 2=Banana}

        // replace
        map.replace(2, "Banana", "Blackberry"); // conditional replace
        map.replace(1, "Pineapple"); // unconditional replace
        System.out.println("After replace: " + map); //{1=Pineapple, 2=Blackberry}

        // size, isEmpty
        System.out.println("Size: " + map.size() + ", isEmpty: " + map.isEmpty()); //2 false

        // ===== Iteration in Java 7 =====
        System.out.println("\n--- Iteration Java 7 ---");

        // 1. keySet()
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + " Value: " + map.get(key));
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
        System.out.println("Values collections.List: " + valuesList);

        // computeIfAbsent
        map.computeIfAbsent(5, k -> "Orange");
        System.out.println("After computeIfAbsent: " + map);

        // merge
        map.merge(2, " Fruit", (oldVal, newVal) -> oldVal + newVal);
        System.out.println("After merge: " + map);
    }
}

/*
Why Use HashMap?
Fastest key-value data structure (O(1) average for put/get/remove).

Used in:
Dictionaries (word → meaning)
Caching (URL → page data)
Counting frequencies (char → count)
Database mappings (id → object)

Why Not Use
If you need sorted keys → use TreeMap.
If you need insertion order → use LinkedHashMap.
If you need thread-safety → use ConcurrentHashMap instead.
If frequent rehashing occurs (large data without tuning load factor), performance may degrade.


 Interview / DSA Points

Time Complexity:
put/get/remove → O(1) average, O(n) worst (hash collision).
Collision Handling: Since Java 8, collisions use Balanced Tree (O(log n)) instead of LinkedList.
HashMap vs Hashtable vs ConcurrentHashMap:
HashMap → unsynchronized, fast.
Hashtable → synchronized (legacy).
ConcurrentHashMap → thread-safe, scalable.
Allows 1 null key, multiple null values.
Load Factor (default 0.75) important for resizing.
 */
