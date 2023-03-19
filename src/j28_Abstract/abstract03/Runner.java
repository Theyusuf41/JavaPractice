package j28_Abstract.abstract03;

public class Runner {
    public static void main(String[] args) {
        Cember c1 = new Cember();
        c1.yarucap=5;
        c1.alan();
        c1.cevre();
        System.out.println(c1.toString());

        Dikdortgen d1 = new Dikdortgen(3,5);
        System.out.println(d1.alan());
        System.out.println(d1.cevre());
        d1.toString();
    }
}
