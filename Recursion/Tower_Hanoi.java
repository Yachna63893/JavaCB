package Recursion;

public class Tower_Hanoi {
    public static void main(String[] args) {
        int n = 3;
        TOH(n, "A","C","B");
    }
    public static void TOH(int n, String src, String help, String des){
        if(n==0){
            return;
        }
        TOH(n-1, src, des, help);
        System.out.println("Move "+n+"th disk from "+src+" to "+des);
        TOH(n-1, help, src, des);
    }
}
