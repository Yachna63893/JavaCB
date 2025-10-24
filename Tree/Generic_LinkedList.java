package Tree;

public class Generic_LinkedList <T> {
    class Node{
        T data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size; 

    //O(1)
    public void AddFirst(T item){
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
    public void AddLast(T item){
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
    public void AddatIndex(T item, int k) throws Exception{
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
    public T GetFirst(int item){
        return head.data;
    }
    //O(1)
    public T GetLast(int item){
        return tail.data;
    }
    //O(N)
    public T GetatIndex(int k) throws Exception{
        return GetNode(k).data;
    }
    //O(1)
    public T remove_first(){
        T rv = head.data;
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
    public T remove_last() throws Exception{
        if(size==1){
            return remove_first();
        }else{
            T rv = tail.data;
            Node sl = GetNode(size-2);
            sl.next = null;
            tail = sl;
            size--;
            return rv;
        }
    }
    public T remove_at_index(int k) throws Exception{
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
    public static void main(String[] args){
        Generic_LinkedList<String> ll = new Generic_LinkedList<>();
        ll.AddLast("Kaju");
        ll.AddLast("Ankit");
        ll.AddLast("Ankita");
        ll.AddLast("Vishal");
        ll.AddLast("Pooja");
        ll.AddLast("Anku");
        ll.AddLast("Puneet");
        ll.AddLast("Amisha");
        ll.Display();
    }
}