package StackOop;

public class StackO_Client {
    public static void main(String[] args) throws Exception{
        Stack_O s = new Stack_O();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.peek());
        s.Display();
        System.out.println(s.pop());
        s.Display();
        s.push(50);
        s.Display();
        s.push(60);
        // s.push(70);
    }
}
