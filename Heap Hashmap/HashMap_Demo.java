package Heap_Hashmap;

import java.util.*;

public class HashMap_Demo {
    public static void main(String[] args) {
        // HashMap<String, Integer> map = new HashMap<>();
        // //add - put
        // map.put("Raj", 89);
        // map.put("Ankit", 79);
        // map.put("Kaju", 99);
        // map.put("Ankita", 59);
        // map.put("Vishal", 77);
        // map.put("Pooja", 88);
        // map.put("Puneet", 73);
        // System.out.println(map);

        // //present or not - contains
        // System.out.println(map.containsKey("Aniket"));
        // System.out.println(map.containsKey("Pooja"));


        // //get
        // System.out.println(map.get("Aniket"));
        // System.out.println(map.get("Pooja"));

        // //remove
        // System.out.println(map.remove("Aniket"));
        // System.out.println(map.remove("Pooja"));
        // System.out.println(map);

        // //size
        // System.out.println(map.size()); 
        
        

        //O(log n)
        // TreeMap<String, Integer> map1 = new TreeMap<>();
        // //add - put
        // map1.put("Raj", 89);
        // map1.put("Ankit", 79);
        // map1.put("Kaju", 99);
        // map1.put("Ankita", 59);
        // map1.put("Vishal", 77);
        // map1.put("Pooja", 88);
        // map1.put("Puneet", 73);
        // System.out.println(map1);


        LinkedHashMap<String, Integer> map2 = new LinkedHashMap <>();
        //add - put
        map2.put("Raj", 89);
        map2.put("Ankit", 79);
        map2.put("Kaju", 99);
        map2.put("Ankita", 59);
        map2.put("Vishal", 77);
        map2.put("Pooja", 88);
        map2.put("Puneet", 73);
        map2.put(null, 78);
        System.out.println(map2);

        Set<String> set = map2.keySet();
        for(String key:set){
            System.out.println(key+" "+ map2.get(key));
        }


        
    }
}
