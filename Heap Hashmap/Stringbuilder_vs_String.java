package Heap_Hashmap;

public class Stringbuilder_vs_String {
    public static void main(String[] args) {
        String_Demo();
        StringBuilder_Demo();
    }
    public static void String_Demo(){
        String s = "";
        for(int i=0; i<100000; i++){
            s += i;
        }
        System.out.println(s);
    }
    public static void StringBuilder_Demo(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;  i<1000000; i++){
            sb.append(i);
        }
        System.out.println(sb);
    }
}
