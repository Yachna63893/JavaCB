package Java_Basics;

public class Two_D_Array {
    public static void main(String[] args) {
        int[] [] arr = new int[3][4];
        System.out.println(arr);

        int[][] other = arr;
        System.out.println(arr.length);//row ki length
        System.out.println(arr[0].length);//col ki length
        System.out.println(arr[1][2]);
        System.out.println(other.length);
    } 
}
