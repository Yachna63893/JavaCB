package Recursion.Practice;

import java.util.ArrayList;
import java.util.List;

public class Non_Decreasing_Subsequences {
    class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Subsequence(nums, ans, ll, 0);
        return ans;
    }
    public static void Subsequence(int[] arr, List<List<Integer>> ans, List<Integer> ll, int idx){
        if(ll.size() >= 2){
            ans.add(new ArrayList<>(ll));
        }
        for(int i=idx; i<arr.length; i++){
            boolean flag = false;
            for(int j=idx; j<i; j++){
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag) continue;



            if(ll.isEmpty() || arr[i] >= ll.get(ll.size()-1)){
                ll.add(arr[i]);
                Subsequence(arr, ans, ll, i+1);
                ll.remove(ll.size()-1);
            }
        }
    }

}
}
