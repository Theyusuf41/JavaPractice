package j26_Inheritance.inheritance01;

public class Hayvancik { // Grand Parent super Class


    public Hayvancik() {// parametresiz super constructor
        System.out.println("parametre yok hayvancik cons call edildi");
    }

    public void hareket(){
        System.out.println("Hayvancik hareket eder");
    }
    public void beslenme(){
        System.out.println("Hayvancik beslenir.");
    }

    public void su(){
        System.out.println("Hayvancik su icer.");
    }


}
