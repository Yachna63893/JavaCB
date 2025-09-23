package Java_Basics.Assignment;
import java.util.*;

public class Shopping_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int a = 0;
            int h = 0;
            int round = 1;
            t--;
        
        while(true){
            if(round%2 != 0){
                if(a+round>m){
                    System.out.println("Harshit");
                    break;
                }else{
                    a+=round;
                }
            }else{
                if(h+round>n){
                    System.out.println("Aayush");
                    break;
                }else{
                    h+=round;
                }
            }
            round++;
        }
        }
        sc.close();
    }
}   
