package Java_Basics;

import java.util.Scanner;


public class Subarray_Sum_Less_ThanK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        String[] parts = line.split(",");
        int[] arr = new int[n];
        for(int i=0; i<parts.length; i++){
            arr[i] = Integer.parseInt(parts[i].trim());
        }
        int k = sc.nextInt();
        System.out.println(SumK(arr, k));
        sc.close();
    }
    public static int SumK(int[] arr, int k){
        int si = 0;
        int ei = 0;
        int p = 0;
        int ans = 0;
        while(ei<arr.length){
            p = p + arr[ei];
            while (p>=k && si<=ei) {
                p = p - arr[si];
                si++;
            }
            ans = ans +(ei-si+1);
            ei++;
        }
        return ans;
    }
}
