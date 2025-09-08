package Java_Basics;

public class Wrapper_Class {
    public static void main(String[] args) {
        int a = 9;
        Integer a1 = 9;
        System.out.println(a);
        System.out.println(a1);
        a1 = a; //auto-boxing
        // int b = 11;
        // Integer b1 = 189;
        // b = b1; 

        Integer c1 = 18;
        Integer c2 = 18;
        Integer c3 = 189;
        Integer c4 = 189;
        System.out.println(c1 == c2);
        System.out.println(c3 == c4);
    }
}
