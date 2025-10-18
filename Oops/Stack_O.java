package StackOop;
public class Stack_O {
    // private int[] arr;
    protected int[] arr;
    private int idx = -1;
    public Stack_O(){
        arr = new int[5];
    }
    public Stack_O(int n){
        arr = new int[n];
    }
    public boolean IsEmpty(){
        return idx == -1;
    }
    public void push(int item) throws Exception{
        if(isfull()){
            throw new Exception("StackOverflow");
        }
        idx++;
        arr[idx] = item;
    }
    public int size(){
        return idx+1;
    }
    public boolean isfull(){
        return idx == arr.length-1;
    }
    public int pop() throws Exception{
        if(IsEmpty()){
            throw new Exception("StackEmpty");
        }
        int rv = arr[idx];
        idx--;
        return rv;
    }
    public int peek() throws Exception{
        if (IsEmpty()) {
            throw new Exception("StackEmpty");
        }
        int rv = arr[idx];
        return rv;
    }
    public void Display(){
        for(int i=0; i<=idx; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
