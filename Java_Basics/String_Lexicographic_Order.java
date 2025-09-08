package Java_Basics;

public class String_Lexicographic_Order {
    public static void main(String[] args) {
        String s1 = "Kunal";
        String s2 = "Komal";
        // +ve s1>s2
        // -ve s2>s1
        //  0 s1==s2
        // System.out.println(s1.compareTo(s2));
        // System.out.println(s2.compareTo(s1));
        System.out.println(compareTo(s1, s2));
    }
    public static int compareTo(String s1, String s2){
        if(s1==s2){
            return 0;
        }
        int len = Math.min(s1.length(), s2.length());
        for(int i=0; i<len; i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i)-s2.charAt(i);
            }
        }
        return s1.length()-s2.length();
    }
}
