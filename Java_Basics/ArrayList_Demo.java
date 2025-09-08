package Java_Basics;
import java.util.*;
public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        //Add Element
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(1, -9); //pehle index phir element 
        System.out.println(list);

        //get an element
        System.out.println(list.get(3));

        //remove an element
        System.out.println(list.remove(2)); 
        System.out.println(list);
        list.add(20);
        list.add(3);
        list.add(21);
        list.add(33);
        System.out.println(list);
        
        //update
        list.set(4, -11);
        System.out.println(list);

        //size 
        System.out.println(list.size());

        //sort
        Collections.sort(list);
        System.out.println(list);

        ArrayList<String> ll = new ArrayList<>();
        ll.add("Ankit");
        ll.add("Raj");
        ll.add("Subham");
        System.out.println(ll);


        for(int i=0; i<ll.size(); i++){
            System.out.print(ll.get(i)+ " ");
        }
        System.out.println();
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }

        System.out.println();
        for(int val :list){
            System.out.print(val + " ");
        }
    }
}
