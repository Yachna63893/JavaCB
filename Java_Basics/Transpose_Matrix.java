package Java_Basics;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,4,5},
                       {7,8,9,6},
                       {3,11,15,16},
                       {10,12,13,15}};
        transpose(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
