package StackOop;

public class Linked_List {
    class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size; 

    //O(1)
    public void AddFirst(int item){
        Node nn = new Node();
        nn.data = item;
        if (size==0) {
            head = nn;
            tail = nn;
            size++;
        }
        else{
            nn.next = head;
            head = nn;
            size++;  
        }
    }
    //O(1)
    public void AddLast(int item){
        if (size==0) {
            AddFirst(item);
        }else{
            Node nn = new Node();
            nn.data = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }
    //O(N)
    public void AddatIndex(int item, int k) throws Exception{
        if(k==0){
            AddFirst(item);
        }else if(k==size){
            AddLast(item);
        }else{
            Node nn = new Node();
            nn.data = item;
            Node k_1th = GetNode(k-1);
            nn.next = k_1th.next;
            k_1th.next = nn;
            size++;
        }
    }
    //O(1)
    public int GetFirst(int item){
        return head.data;
    }
    //O(1)
    public int GetLast(int item){
        return tail.data;
    }
    //O(N)
    public int GetatIndex(int k) throws Exception{
        return GetNode(k).data;
    }
    //O(1)
    public int remove_first(){
        int rv = head.data;
        if(size==1){
            head = null;
            tail = null;
            size--;
        }
        else{
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        size--;
        return rv;
    }
    //O(N)
    public int remove_last() throws Exception{
        if(size==1){
            return remove_first();
        }else{
            int rv = tail.data;
            Node sl = GetNode(size-2);
            sl.next = null;
            tail = sl;
            size--;
            return rv;
        }
    }
    public int remove_at_index(int k) throws Exception{
        if(k==0){
            return remove_first();
        }else if(k== size-1){
            return remove_last();
        }else{
            Node k_1th = GetNode(k-1);
            Node kth = k_1th.next;
            k_1th.next = kth.next;
            kth.next = null;
            size--;
            return kth.data;
        }
    }
    //O(N)
    public void Display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println(".");
    }
    //O(N)
    private Node GetNode(int k) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("Index not in range");
        }
        Node temp = head;
        for(int i=0; i<k; i++){
            temp = temp.next;
        }
        return temp;
    }
    public int size(){
        return size;
    }
 
}
