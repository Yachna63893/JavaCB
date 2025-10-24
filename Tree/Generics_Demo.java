package Tree;

public class Generics_Demo {
    public static void main(String[] args) {
        String[] arr = {"Ankit", "Ankita","Kaju","Amisha","Raj","Vishal","Pooja"};
        Display(arr);

        Integer[] arr1 = {1,2,3,4,5};
        Display(arr1);
    }
    public static <T> void Display(T[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
