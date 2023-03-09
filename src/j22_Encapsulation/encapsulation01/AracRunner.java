package j22_Encapsulation.encapsulation01;

public class AracRunner {
    public static void main(String[] args) {
        Arac arac1 = new Arac("mercedes", "pempe", 2000,1964);
        Arac arac2 = new Arac("volvo", "girmizi", 2500,2008);
        Arac arac3 = new Arac("mercedes", "zari", 500,2000);

        System.out.println(arac1);
        System.out.println(arac2.getMotor());


    }
}
