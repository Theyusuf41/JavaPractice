package j17_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        double preise = 100;
        System.out.println("Method oncesi fiyat degeri "+ preise);
        fazlaFiyat(preise);
        System.out.println("Method sonrasi fiyat degeri " + preise);

    }

    private static void fazlaFiyat(double preise) {
        preise*=1.24;
        System.out.println(preise);
    }
}
/*
Java Pass By Value bir programlama dilidir.
Bir  primitive  variable  argument olarak bir methoda call edildiğinde variable
değil bir copy clone (vesikalık) (pointer)değeri gönderilir.

 */
// task -> verilen fiyat için %24 artırılmış fiyatı print eden method  create ediniz.