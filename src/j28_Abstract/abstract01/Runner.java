package j28_Abstract.abstract01;

public class Runner {
    public static void main(String[] args) {
        Civic c1 = new Civic();
        c1.motor();
        c1.kapi();
        c1.koltuk();
        c1.sunroof();
        c1.isim= "typeR";
        System.out.println(c1.isim);


        Honda c2 = new Accord();
        c2.koltuk();
        c2.kapi();
        c2.sunroof();
        c2.motor();
        c2.isim = "fena modifiye";

    }
}
