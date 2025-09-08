// package Recursion;

// public class Palindrome_Partitioning {
//     public static void main(String[] args) {
//         String ques = "nitin";
//         Partitioning(ques, "");

//     }
//     public static void Partitioning(String ques, String ans){
//         if(ques.length()==0){
//             System.out.println(ans);
//             return;
//         }
//         for(int i=1; i<=ques.length(); i++){
//             String s = ques.substring(0,i);
//             if(isPalindrome(s)){
//                 Partitioning(ques.substring(i), ans + s + "|" );
//             }
//         }
//     }
//     public static boolean isPalindrome(String s){
//         int i = 0;
//         int j = s.length()-1;
//         while(i<j){
//             if(s.charAt(i)!=s.charAt(j)){
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
// }


//2d list k saath vala code
package Recursion;
import java.util.*;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String ques = "nitin";
        List<String> ll = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        Partitioning(ques, ll,ans);
        System.out.println(ans);
    }
    public static void Partitioning(String ques,  List<String> ll, List<List<String>> ans){
        if(ques.length()==0){
            // System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=1; i<=ques.length(); i++){
            String s = ques.substring(0,i);
            if(isPalindrome(s)){
                ll.add(s);
                Partitioning(ques.substring(i), ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}