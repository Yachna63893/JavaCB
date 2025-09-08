package Java_Basics;

public class Fun_Demo_2 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Add();
        System.out.println("Bye");
    }
    public static void Add(){
        int a = 9; 
        int b = 7; 
        int c = a+b;
        int x = Sub();
        System.out.println(c+x);
    }
    public static int Sub(){
        int a = 9; 
        int b = 7; 
        int c = a-b;
        return c; 
    }
}
