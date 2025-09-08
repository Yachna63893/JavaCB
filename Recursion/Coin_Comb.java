package Recursion;

public class Coin_Comb {
    public static void main(String[] args) {
        int[] coin = {2,3,5};
        int amt = 8;
        Combination(coin, amt, "", 0);
    }
    public static void Combination(int[] coin, int amt, String ans, int idx){
        if(amt==0){
            System.out.println(ans);
            return;
        }
        for(int i=idx; i<coin.length; i++){
            if(amt>=coin[i]){
                Combination(coin, amt-coin[i], ans+coin[i], i);//i beacause infinite coins avialable hain if not than i+1 karte also idx isliye nahi le rahe kyunki idx loop ka start point bataega but i bataega konse coin ko pick kia gya hai uske aage se call lagayein
            }
        }
    }
}
