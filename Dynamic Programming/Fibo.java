package Dynamic_Programming;

public class Fibo {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        System.out.println(fiboTD(n, dp));
        System.out.println(fiboBU(n));

    }
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int f1 = fibo(n-1);
        int f2 = fibo(n-2);
        return f1+f2;
    }
    public static int fiboTD(int n, int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n] != 0){ //dp apply kar rahe
            return dp[n];
        }
        int f1 = fibo(n-1);//dp[n-1]
        int f2 = fibo(n-2);//dp[n-2]
        return dp[n] = f1+f2; //yaad kar rha hai
    }
    public static int fiboBU(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2 ; i<dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
