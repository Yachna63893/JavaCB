package Recursion;

public class Coin_Toss_2 {
    public static void main(String[] args) {
        int n=3;
        CoinToss(n,""); 
        System.out.println(count);
    }
    static int count = 0;

    public static void CoinToss(int n, String ans){
        if(n==0){
            System.out.println(ans);
            count++;
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1) != 'H'){
            CoinToss(n-1, ans+"H");
        }
        CoinToss(n-1, ans+"T");
    }
}
