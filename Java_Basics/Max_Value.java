package Java_Basics;

public class Max_Value {
    public static void main(String[] args) {
        int[] arr = {3,5,1,7,8,6};
        System.out.println(Max(arr));
        System.out.println(Max1(arr));
    }
    public static int Max(int[] arr){
        int m = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>m){
                m = arr[i];
            }
        }
        return m;
    }
    //Another Method for finding max value
    public static int Max1(int[] arr){
        int m = Integer.MIN_VALUE; //-2^31 is minumum value in integers range
        for(int i=0; i<arr.length; i++){
            if(arr[i]>m){
                m = arr[i];
            }
        }
        return m;
    }
}
