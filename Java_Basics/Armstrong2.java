package Java_Basics.Assignment;
import java.util.*;

public class Armstrong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        for(int i = n1; i<=n2; i++){
            armstrong(i);
        }
    }
    public static int countofdigit(int n){
        int count = 0;
        while(n>0){
            n = n/ 10;
            count++;
        }
        return count;
    }
    public static void armstrong(int n){
        int c = countofdigit(n);
        int temp = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum = (int) (sum + Math.pow(rem, c));
            n = n / 10;
        }
        if(sum == temp){
            System.out.println(sum);
        }
    }
}
