package j20_Consructor;

public class C01_Constuctor {
    //fields-> obj alacagi variable'lar
    String str; // class level'da create edilen initial edilmemis instance variable.
    String selam="selam javacan"; // class level'da create edilen initial edilmis instance variable.
    //C01_Constuctor obj1 = new C01_Constuctor(); // obj boyle create edilir. Parametresiz default cons. obj1 ile create edildi.

    public static void main(String[] args) {
        // ClassName objName = new constructor
        C01_Constuctor obj1 = new C01_Constuctor(); // obj boyle create edilir. Parametresiz default cons. obj1 ile create edildi.
        C01_Constuctor obj2 = new C01_Constuctor(); // obj boyle create edilir. Parametresiz default cons. obj1 ile create edildi.
        //C01_Constuctor obj1 = new C01_Constuctor(); // Birden fazla ayni scopeda obj uretilmez.

        obj1.selam = " selam caniiim ";// obj1 ile ins. variable call edilerek atama yapildi.
        obj2.selam = " sefil yusuf ";// obj1 ile ins. variable call edilerek atama yapildi.

        System.out.println(obj2.selam);
    }
}
/*
1- consturctor ismi Calss name ile aynı olmalı.Cons name Buyuk harf ile başlamalı
2- constructor create edilirkene name den sonra () {} mutlaka kullanılmalı.
3- eger p'li cons. create edilirse java default cons.(p'siz) ezer(siler)
4- cons. return type olmaz method'dan ayıran en temel  özelliğidir.
5-Class tanımlandığında java default cons. kendi create eder.
6-Fields-> obj'nin uretilirken alacagı değer variables
7-bir class'da bir den çok cons. tanımlanabilir
 */