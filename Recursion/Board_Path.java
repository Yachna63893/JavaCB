package Recursion;

public class Board_Path {
    public static void main(String[] args) {
        int n = 4;
        // Printans(n, 0, "");
        // System.out.println();
        System.out.println(Countans(n, 0, ""));
    }
    public static void Printans(int n, int curr, String ans){
        if(curr==n){
            System.out.print(ans+" ");
            return;
        }
        if(curr>n){
            return;
        }
        // Printans(n, curr+1, ans+1);
        // Printans(n, curr+2, ans+2);
        // Printans(n, curr+3, ans+3);

        for(int i = 1; i<=n; i++){
            Printans(n, curr+i, ans+i);
        }
    }
    public static int Countans(int n, int curr, String ans){
        if(curr==n){
            System.out.print(ans+" ");
            return 1;
        }
        if(curr>n){
            return 0;
        }
        int count = 0;
        for(int i = 1; i<=n; i++){
            count += Countans(n, curr+i, ans+i);
        }
        return count;
         
    }
}
