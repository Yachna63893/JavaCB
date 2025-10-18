package StackOop;

public class Linked_List_Client {
    public static void main(String[] args) throws Exception{
        Linked_List ll = new Linked_List();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddLast(40);
        ll.Display(); 
        ll.AddatIndex(-20, 2);
        ll.AddLast(42);
        ll.AddLast(67);
        ll.AddLast(90);
        ll.Display(); 
        System.out.println(ll.GetFirst(0));
        System.out.println(ll.GetLast(0));
        System.out.println(ll.GetatIndex(2));
        System.out.println(ll.remove_first());
        ll.Display();
        System.out.println(ll.remove_last());
        ll.Display();
        System.out.println(ll.remove_at_index(2));
        ll.Display();
    }
}
