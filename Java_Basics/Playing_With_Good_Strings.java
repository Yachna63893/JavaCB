package Java_Basics;

import java.util.Scanner;

public class Playing_With_Good_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(longest_Good_Strings(s));
        sc.close();

    }
    public static int longest_Good_Strings(String s){
        int count = 0;
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Isvowels(ch) == true){
                count++;
            }else{
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        ans = Math.max(ans, count);
        return ans;
    }
    public static boolean Isvowels(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}
