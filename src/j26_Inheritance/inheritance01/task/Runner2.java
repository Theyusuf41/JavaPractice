package j26_Inheritance.inheritance01.task;

public class Runner2 {
    public static void main(String[] args) {
        SuperClass sp = new SuperClass();
        SubClass s1 = new SubClass();

        javaCan(sp,s1);
    }

    public static void javaCan(SuperClass sp, SubClass s1) {
        s1.ebikGabik();
        sp.ebikGabik();
        System.out.println(SubClass.sayi + " subclasstan geldim aga");
        System.out.println(SuperClass.sayi + " superclasstan geldim aga");
    }




}
