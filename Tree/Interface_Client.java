package Tree;

public class Interface_Client implements DSAI {

    @Override
    public void push(int item) {
         
    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public int peek() {
       return 0;
    }

    @Override
    public void Display() {
        
    }

    @Override
    public void fun() {
        
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }
    public static void main(String[] args){
        Interface_Client ic = new Interface_Client();
        ic.Display();
    }
}
