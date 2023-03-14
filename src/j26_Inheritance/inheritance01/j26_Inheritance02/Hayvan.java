package j26_Inheritance.inheritance01.j26_Inheritance02;

public class Hayvan {
    int a;
    int m=3;

    public Hayvan() {
        System.out.println("Parametresiz hayvancik call edildi");
    }
    public Hayvan(int x){
        System.out.println("Parametreli hayvancik call edildi");
    }
    public void mA(){
        System.out.println("mA -> hayvan class meth call edildi");
    }
    public void mM(){
        System.out.println("mM -> hayvan class meth call edildi");
    }
}
