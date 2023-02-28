package j17_PassByValue;

public class C04_PassByValue {
    static double price ;
    static double discount ;
    public static void main(String[] args) {
        price=100;
        discount=0.1;
        System.out.println("The price before discount " + price);
        azpara(price, discount); // overloading
        discount=0.25;
        azpara(10, 0.5);
        discount=0.5;
        azpara(500, 0.6);
        System.out.println("The price after discount " + price);


    }

    private static void azpara(double price, double discount){
        price*=(1 - discount);
        System.out.println("inmis etiket fiyati " + price);
    }
}
/*
eger bir method'a yapılan değişiklik kalıcı olsun istenirse
1.değişklik  yapılan variable'lar static olarak tanımlanır.
 */