package Map;

import java.util.*;
import java.util.stream.Collectors;

public class Basic_Program {
    public static void main(String[] args) {
        // ====== Create Map ======
        Map<Integer, String> map = new HashMap<>();

        // put, putIfAbsent
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.putIfAbsent(2, "Blueberry"); // won't overwrite Banana
        System.out.println("Initial Map: " + map); //{1=Apple, 2=Banana, 3=Cherry}

        // get, getOrDefault
        System.out.println("Get key 2: " + map.get(2)); //Banana
        System.out.println("GetOrDefault (key 5): " + map.getOrDefault(5, "Not Found")); //Not Found

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
        System.out.println("Size: " + map.size() + ", isEmpty: " + map.isEmpty()); //Size: 2, isEmpty: false

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

        // collect to list
        List<String> valuesList = map.values().stream().collect(Collectors.toList());
        System.out.println("Values List: " + valuesList); //[Pineapple, Blackberry]

        // ===== TreeMap (Sorted Map) =====
        TreeMap<Integer, String> treeMap = new TreeMap<>(map);
        treeMap.put(5, "Orange");
        treeMap.put(4, "Kiwi");
        System.out.println("\nTreeMap (Natural Sorting): " + treeMap); //{1=Pineapple, 2=Blackberry, 4=Kiwi, 5=Orange}

        // TreeMap with custom Comparator (Descending)
        TreeMap<Integer, String> treeMapDesc = new TreeMap<>(Collections.reverseOrder());
        treeMapDesc.putAll(treeMap);
        System.out.println("TreeMap (Custom Desc Sorting): " + treeMapDesc); //{5=Orange, 4=Kiwi, 2=Blackberry, 1=Pineapple}
    }
}

/*
Map<K,V> is a key-value pair collection.
Keys are unique, values can be duplicate.
Common Implementations:
HashMap → unordered, fastest.
LinkedHashMap → maintains insertion order.
TreeMap → sorted order (natural / custom comparator).
Hashtable → legacy, synchronized.

When to Use
You need fast search/update by key.
You need mapping relation (studentId → studentName).
You need sorted maps → TreeMap.
You need insertion-order iteration → LinkedHashMap.

Why Not Use
If order matters strictly (use List instead).
If you need multiple values per key → use Map<K, List<V>>.
If you need concurrent access → use ConcurrentHashMap instead of HashMap.

Developer Must-Know
Prefer HashMap for general use.
Use LinkedHashMap when order matters.
Use TreeMap when sorting is required.
Always handle null keys carefully (HashMap allows 1 null key, Hashtable & TreeMap do not).
Java 8 introduced forEach, computeIfAbsent, merge, replaceAll.
HashMap: average O(1), worst-case O(n) (hash collision).
TreeMap: O(log n) for insertion, deletion, search.
 */
