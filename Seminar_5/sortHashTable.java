// How to Sort a HashMap by Value in Java?
// https://www.digitalocean.com/community/tutorials/sort-hashmap-by-value-java

package Seminar_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class sortHashTable {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        ArrayList<Integer> list = new ArrayList<>();
        map.put("A", 5);
        map.put("B", 7);
        map.put("C", 3);
        map.put("D", 1);
        map.put("E", 2);
        map.put("F", 8);
        map.put("G", 4);
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        
        Collections.sort(list); 
        for (int num : list) {
            for (Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }
        System.out.println(sortedMap);
    }
}
