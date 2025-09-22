package Java_Basics.Assignment;

import java.util.*;

public class chewbaccca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(rev(n));
        sc.close();
    }
    public static long countofdigit(long n){
        long count = 0;
        while(n>0){
            count++;
            n = n / 10;
        }
        return count;
    }
    public static long chewb(long n){
        long sum = 0;
        long n1 = countofdigit(n);
        for(long i=1; i<=n1; i++){
            long rem = n % 10;
            long c = 9 - rem;
            if(c<rem){
                sum = sum * 10 + c;
            }else{
                sum = sum * 10 + rem;
            }
            n = n / 10;
        }    
        return sum;
    }

    public static long rev(long n){
        long s = 0;
        long x = chewb(n);
        long c = countofdigit(n);
        for(long i=1; i<=c; i++){
            long rem = x % 10;
            if(i==1 && rem==0){
                s = s*10 + 9;
            }else{
                s = s * 10 + rem;
            }
            x = x / 10;
        }
        return s;
    }
}
