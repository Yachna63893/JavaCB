package Java_Basics;

public class Freq_Array {
    public static void main(String[] args) {
        String s = "djhsiufhisfiehuifehuihesheisuhuiehfie";
        int[] frq = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            frq[ch-'a']++;  
        }
        for(int i=0; i<frq.length; i++){
            System.out.print(frq[i]+ " ");
        }
    }

}
