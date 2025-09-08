package Recursion;

public class Axis_Orbit {
    public static void main(String[] args) {
        String s  = "aaa";
        System.out.println(CountPalindromic(s));
    }
    public static int CountPalindromic(String s){
        int oddc = 0;
        //odd
        for(int ax=0; ax<s.length(); ax++){
            for(int orb = 0;ax-orb>=0 && ax+orb<s.length(); orb++){
                if(s.charAt(ax-orb)!=s.charAt(ax+orb)){
                    break;
                }
                oddc++;
            }
        }
        int evenc = 0;
        //even
        for(double ax = 0.5; ax<s.length(); ax++){
            for(double orb = 0.5; ax-orb>=0 && ax+orb<s.length(); orb++){
                if(s.charAt((int)(ax-orb)) != s.charAt((int)(ax+orb))){
                    break;
                }
                evenc++;
            }
        }
        return oddc+evenc;
        // return oddc;
    }
}
