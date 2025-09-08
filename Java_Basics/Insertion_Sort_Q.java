package Java_Basics;

public class Insertion_Sort_Q {
    public static void main(String[] args) {
        int[] arr  = {1,3,4,5,6,8,2};
        InsertLastElement(arr, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void InsertLastElement(int[] arr, int i){
        int item = arr[i];
        int j = i-1;
        while(j>=0 && arr[j]>item){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = item;
    }
}