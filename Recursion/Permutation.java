package Recursion;

public class Permutation {
    public static void main(String[] args) {
        String ques = "abc";
        // PrintPerm(ques, "");
        System.out.println(CountPerm(ques, ""));
    }
    public static void PrintPerm(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<ques.length(); i++){
            char ch = ques.charAt(i);
            String s1 = ques.substring(0,i);
            String s2 = ques.substring(i+1);
            PrintPerm(s1+s2, ans+ch);
        }
    }
    public static int CountPerm(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        for(int i=0; i<ques.length(); i++){
            char ch = ques.charAt(i);
            String s1 = ques.substring(0,i);
            String s2 = ques.substring(i+1);
            count += CountPerm(s1+s2, ans+ch);
        }
        return count;
    }
}
