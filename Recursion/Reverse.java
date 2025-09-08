package Recursion;

public class Reverse {
    public static void main(String[] args) {
        int n = 5;
        rev(n);
    }
    public static void rev(int n){
        if(n==0){
            return;
        }
        System.out.println(n); 
        rev(n-1);
    }
}
