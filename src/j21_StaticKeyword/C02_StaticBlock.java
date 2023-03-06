package j21_StaticKeyword;

public class C02_StaticBlock {
    static String isim = "sefil javaci";

    static{ // static block acildi
        System.out.println("Ilk ben calistim");
        System.out.println(isim);
        isim = "yusuf bey";
    }
    public static void main(String[] args) {
        System.out.println("main method calisti **");

        isim = "ahmet bey";
        System.out.println(isim + " main icinde update edildi!!");

    }

    static{ // static block acildi (mainden sonra)
        System.out.println("Son  ben calistim ****** ");
        System.out.println(isim);
        isim = "ali bey";
        System.out.println(isim + " update sonrasi isimin son hali");
    }
}
/*
       1.static block yapıları static variable'rı değer ataması update için kullanılır
       2.static block Class oluşturulduğunda butun method'lardan(main method dahil) önce çalışır
       3.birden fazla static block varsa yukarıdan aşagiya sıralama ile çalışır.
       4.static bloklar sadece 1 kere en basta calisir static olmayan bloklar her obje olusturulurken yeniden calisir
 */