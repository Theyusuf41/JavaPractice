package j26_Inheritance.inheritance01.j26_Inheritance02;

public class Runner {
    public static void main(String[] args) {
        Koyun k1 = new Koyun();
        System.out.println(k1.a + " k1.a"); // hayvandan geldi
        System.out.println(k1.c + " k1.c"); // koyundan geldi
        System.out.println(k1.d + " k1.d"); // koyundan geldi
        System.out.println(k1.m + " k1.m"); // mammal geldi
        // eger variable kendisinde tanimli ise onu alir. Eger yoksa bir ust parenttan alir.
        System.out.println("**************");
        Mammal k2 = new Koyun("tuylu");
        System.out.println(k2.a + " k2.a"); // hayvandan geldi
        System.out.println(k2.c + " k2.c"); // koyundan geldi
        //System.out.println(k2.d + " k2.d"); // koyundan geldi
        System.out.println(k2.m + " k2.m"); // mammal geldi
        System.out.println("**************");
        Hayvan k3 = new Koyun();
        System.out.println(k3.a + " k3.a"); // hayvandan geldi
        //System.out.println(k3.c + " k3.c"); // koyundan geldi
        //System.out.println(k3.d + " k3.d"); // koyundan geldi
        System.out.println(k3.m + " k3.m"); // mammal geldi
        System.out.println("**************");
        k1.mA(); // hayvan class meth call edildi
        k1.mC(); // koyun class meth call
        k1.mM(); // Mammal class meth call

        // tanimladigimiz obje uzerinden variablara bakariz. Eger mammalden tanimladiysak koyundaki variable'lari alamayiz.
        // Parent veya grandparenttanda istedigimiz obj uretilebilir ancak ondaki variablelerin hepsini alamayiz!!!




    }
}
