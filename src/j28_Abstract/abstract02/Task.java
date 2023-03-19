package j28_Abstract.abstract02;

public class Task {
    public static void main(String[] args) {
        Isci isci1 = new Isci();
        isci1.name = "mahmut";
        System.out.println(isci1.name);
        isci1.maasHesapla();
        isci1.maasBilgisi();

        IdariPersonal idr1 = new IdariPersonal();
        idr1.name= "yusuf";
        System.out.println(idr1.name);
        idr1.maasHesapla();
        idr1.maasBilgisi();
        idr1.sigorta();
    }
}
