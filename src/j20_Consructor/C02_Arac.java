package j20_Consructor;

public class C02_Arac {
    // fields ->  obj variable
    String marka;
    String model;
    int km;
    double motorHacmi;
    int fites;
    int kacinciEl;
    int yil;




    public static void main(String[] args) {
        C02_Arac obj1 = new C02_Arac();
        obj1.marka = "volvo";
        obj1.model = "c40";
        obj1.km = 100000;
        obj1.motorHacmi = 1800;
        obj1.fites = 5;
        obj1.kacinciEl = 3;
        obj1.yil = 2004;
        System.out.println(obj1 + " arac1");


        C02_Arac obj2 = new C02_Arac();
        obj2.marka = "bentley";
        obj2.model = "continental";
        obj2.km = 10000;
        obj2.motorHacmi = 5000;
        obj2.fites = 6;
        obj2.kacinciEl = 2;
        obj2.yil = 2015;
        System.out.println(obj2 + " arac2");

        C02_Arac obj3 = new C02_Arac();
        obj3.marka = "mercedes";
        obj3.model = "a180";
        obj3.km = 150000;
        obj3.motorHacmi = 1800;
        obj3.fites = 6;
        obj3.kacinciEl = 2;
        obj3.yil = 2016;
        System.out.println(obj3 + " arac3");

    }// main sonu
    @Override
    public String toString() { // bu method obj datalarini toString yaparak print etmemizi saglar
        return
                "marka='" + marka + '\'' +
                        ", model='" + model + '\'' +
                        ", km=" + km +
                        ", motorHacmi=" + motorHacmi +
                        ", fites=" + fites +
                        ", kacinciEl=" + kacinciEl +
                        ", yil=" + yil;

    }
}// class sonu
//Task-> fields: marka,model,km,motorHacmi, fites, kacinciEL, yil olan obj create ediniz: