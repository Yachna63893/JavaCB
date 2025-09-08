package Java_Basics;

public class Substring_Print {
    public static void main(String[] args) {
        String s = "Hellobye";
        // System.out.println(s.substring(2,5));
        // System.out.println(s.substring(5, 8));
        // System.out.println(s.substring(2));
        PrintSubString(s);
    }
    public static void PrintSubString(String s){
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
}
