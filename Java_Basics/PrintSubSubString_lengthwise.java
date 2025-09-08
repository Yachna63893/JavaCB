package Java_Basics;

public class PrintSubSubString_lengthwise {
    public static void main(String[] args) {
        String str = "hello";
        Substring_Print(str);
    }
    public static void Substring_Print(String str){
        for(int len=1; len<=str.length(); len++){
            for(int j=len; j<=str.length(); j++){
                int i = j-len;
                System.out.println(str.substring(i,j));
            } 
        }
    }
}
