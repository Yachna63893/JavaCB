package StackOop;

public class Sum_Of_Number {
    public static void main(String[] args) {
        System.out.println(Add(2, 3));
        System.out.println(Add(2, 3, 11));
        System.out.println(Add(2, 3, 8.9));
        System.out.println(Add(2,3,4,45,6,4,6,7,8,76,5,4,3,2));
    }
    public static int Add(int a, int b){
        return a+b;
    }
    public static int Add(int a, int b, int c){
        return a+b;
    }
    public static int Add(int a, int b, double c){
        return (int) (a+b+c);
    }
    public static int Add(int y, int... x){
        int sum = 0;
        for(int i=0; i<x.length; i++){
            sum+= x[i];
        }
        return sum;
    }
}
//Private method ki overriding nahi hoti
