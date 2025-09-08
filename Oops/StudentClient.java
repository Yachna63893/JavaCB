package StackOop;

public class StudentClient {
    public static void main(String[] args) {
         System.out.println("Hello");

        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.age);
        s.name = "Kaju";
        s.age = 18;
        s.Intro_yourSelf();
        Student s1 = new Student();
        s1.name = "Kamlesh";
        s1.age = 20;
        s1.Intro_yourSelf();
    }
}
