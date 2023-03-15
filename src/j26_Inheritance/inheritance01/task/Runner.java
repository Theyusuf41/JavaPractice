package j26_Inheritance.inheritance01.task;

public class Runner {
    public static void main(String[] args) {
        A a = new A();
        // System.out.println(a.str1); // bad practice
        System.out.println(A.str1); // best practice
        B b = new B();
        System.out.println(B.str1);
    }
}
