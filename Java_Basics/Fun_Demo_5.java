package Java_Basics;

public class Fun_Demo_5 {
    static int val = 100;  //Global Variable
    public static void main(String[] args) {
        System.out.println("Hello");
        int a = 7;
        int b = 11;
        System.out.println(val); 
        System.out.println(Add(a,b));
        System.out.println(val);
    }
    public static int Add(int a, int b){
        int c = a+b;
        // int val = 60;
        val = val+5;
        // Fun_Demo_5.val = Fun_Demo_5.val + 5;
        return c - Sub(c,b);
    }
    public static int Sub(int a, int b){
        int c = a - b;
        return c;
    }
}
