package j26_Inheritance.inheritance01.j26_Inheritance02;

public class Koyun extends Mammal{
    int c=2;
    int d=7;

    public Koyun() {
        super();// parent super class
        System.out.println("Parametresiz Koyun call edildi");
    }

    public Koyun(String str) {
        this(); // Bu class'taki parametresiz const call edildi
        System.out.println(super.c); // parent class c variable call edilir.
        System.out.println("Parametresiz Koyun call edildi");
    }
    public void mC(){ // parent class'tan gelen method override edildi ve burasi onu ezdi
        System.out.println("mC -> Koyun Class meth call");
    }
}
