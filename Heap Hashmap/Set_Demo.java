package Heap_Hashmap;

import java.util.*;

public class Set_Demo {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();
        // set.add(20);
        // set.add(2);
        // set.add(201);
        // set.add(1039);
        // set.add(5);
        // System.out.println(set);

        // //O(1)
        // System.out.println(set.contains(2));
        // System.out.println(set.contains(25)); 

        // //O(1) remove
        // System.out.println(set.remove(2));

        // for(int v : set){
        //     System.out.print(v+" ");
        // }

        //O(log n) - sorted order
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(20);
        set1.add(2);
        set1.add(201);
        set1.add(1039);
        set1.add(5);
        System.out.println(set1);


        //O(1) - 1 operation ka
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(20);
        set2.add(2);
        set2.add(201);
        set2.add(1039);
        set2.add(5);
        System.out.println(set2 );
    }
}
