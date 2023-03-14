package j26_Inheritance.inheritance01.j26_Inheritance02;

public class Mammal extends Hayvan {
    int m=1;
    int c=4;
    public Mammal() {
        this('H');
        System.out.println("Parametresiz Mammal call edildi");

    }

    public Mammal(char y) {
        super(34);
        System.out.println("Parametli Mammal const call edildi");
    }

    public void mC(){
        System.out.println("mC -> Mammal Class meth call");
    }

    public void mM(){ // parent'dan aldigi methodu ezer
        System.out.println("mM -> Mammal Class meth call");
    }



}
