package StackOop;
import java.util.Stack;

public class Queue_Using_Stack {
    private Stack<Integer> st;
    public Queue_Using_Stack(){
        st = new Stack<>();
    }
    public int size(){
        return st.size();
    }
    public boolean Isempty(){
        return st.isEmpty();
    }
    //O(N)
    public void Enqueue(int item){
        Stack<Integer> hlpS = new Stack<>();
        while(!st.isEmpty()){
            hlpS.push(st.pop());
        }
        st.push(item);
        while(!hlpS.isEmpty()){
            st.push(hlpS.pop());
        }
    }
    public int Dequeue(){
        return st.pop();
    }
    public int Getfront(){
        return st.peek();
    }
    public static void main(String[] args){
        Queue_Using_Stack q = new Queue_Using_Stack();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
        q.Enqueue(60);
        q.Enqueue(70);
        System.out.println(q.Dequeue());
        System.out.println(q.Getfront());
    }
}
