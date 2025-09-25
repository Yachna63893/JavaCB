package Java_Basics.Assignment;

import java.util.*;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(rev(n));
        sc.close();
    }
    public static long replace(long n){
        if(n==0){
            return 5;
        }    
        long sum = 0;
        while(n>0){
            long rem = n % 10;
            if(rem == 0){
                sum = sum*10 + 5;
            }else{
                sum = sum*10 + rem;
            }
            n = n / 10;
        }
        return sum;
    }
    public static long rev(long n){
        long s = 0;
        long c = replace(n);
        while(c > 0){
            long rem =  c % 10;
            s = s * 10 + rem;
            c = c / 10;
        }
        return s;
    }
}
