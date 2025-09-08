package Recursion;

import java.util.*;

public class Combination_Sum {
    public static void main(String[] args) {
        int[] coin = {2,3,5};
        int amt = 8;
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Combination(coin, amt, ll, 0,ans);
        System.out.println(ans);
    }
    public static void Combination(int[] coin, int amt, List<Integer> ll, int idx, List<List<Integer>> ans){
        if(amt==0){
            // System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx; i<coin.length; i++){
            if(amt>=coin[i]){
                ll.add(coin[i]);
                Combination(coin, amt-coin[i], ll, i,ans);
                ll.remove(ll.size()-1);//Backtrack
            }
        }
    }
}
