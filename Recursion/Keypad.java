package Recursion;
import java.util.*;
public class Keypad {
    static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
       String ques = "23";
       List<String> ll = new ArrayList<>();
       Comb(ques, "",ll);
       System.out.println(ll);
    }
    public static void Comb(String ques, String ans,List<String> ll){
        if(ques.length()==0){
            // System.out.println(ans+" ");
            ll.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        int num = ch-'0';
        String press = map[num];
        for(int i=0; i<press.length(); i++){
            Comb(ques.substring(1),ans+press.charAt(i),ll);
        }
    }
}
