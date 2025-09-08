package Java_Basics;

import java.util.Scanner;
import java.util.Arrays;

public class Aggressive_Cow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n  = sc.nextInt();
            int c = sc.nextInt();
            int[] stall = new int[n]; 
            for(int i=0; i<stall.length; i++){
                stall[i] = sc.nextInt();
            }
            Arrays.sort(stall);
            System.out.println(largest_min_dis(stall, c));
            t--;
            sc.close();
        }
    }
    public static int largest_min_dis(int[] stall, int c){
        int lo = 0;
        int hi = stall[stall.length-1] - stall[0];
        int ans = 0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(isitpossible(stall,c,mid)==true){
                ans = mid;
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] stall, int c, int mid){
        int cow = 1;
        int pos = stall[0];
        for(int i=1; i<stall.length; i++){
            if(stall[i]-pos>=mid){
                cow++;
                pos = stall[i];
            }
            if(cow==c){
                return true;
            }
        }
        return false;
    }
}
