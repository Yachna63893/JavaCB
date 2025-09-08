package Java_Basics;

public class Subarray_Product_lessthan_K {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};
        int k = 10;
        System.out.println(Product_Less_Than_K(arr, k));
    }
    public static int Product_Less_Than_K(int[] arr, int k){
        int si = 0;
        int ei = 0;
        int  p = 1;
        int ans = 0;
        while (ei<arr.length) {
            p = p * arr[ei];//growing
            while(p>=k && si<=ei){ //shrinking
                p = p/arr[si];
                si++;
            }
            ans = ans + (ei-si+1);
            ei++;
        }
        return ans;
    }
}
