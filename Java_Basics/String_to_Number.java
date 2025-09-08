package Java_Basics;

public class String_to_Number {
    public static void main(String[] args) {
        String str = "42521512";
        int n = Integer.parseInt(str);
        long l = Long.parseLong(str);
        System.out.println(n);
        System.out.println(l);
    }
}
