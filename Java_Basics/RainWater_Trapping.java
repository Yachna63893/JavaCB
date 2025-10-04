package Java_Basics.Assignment2;
import java.util.*;

public class RainWater_Trapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            int[] arr = new int[m];
            for(int j=0; j<arr.length; j++){
                arr[j] = sc.nextInt();
            }
            System.out.println(Trapping(arr));
        }
        sc.close();
    }
    public static int Trapping(int[] arr){
        int n = arr.length; 
        int[] left = new int[n];
        left[0] = arr[0];
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }
        int[] right = new int[n];
        right[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + Math.min(left[i], right[i]) - arr[i];
        }
        return sum;
    }  
}
