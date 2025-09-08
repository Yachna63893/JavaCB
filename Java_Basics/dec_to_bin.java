package Java_Basics;
import java.util.*;

public class dec_to_bin {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int mul = 10;
        while(n>0){
            int rem = n%2;
            sum = sum+rem*mul;
            n=n/2;
            mul = mul*10;
        }
        System.out.println(sum);
        sc.close();
    }
}
