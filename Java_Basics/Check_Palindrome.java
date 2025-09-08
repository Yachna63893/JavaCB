package Java_Basics;

public class Check_Palindrome {
    public static void main(String[] args) {
        String s = "naan";
        System.out.println(IsPalindrome(s));
    }
    public static boolean IsPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
