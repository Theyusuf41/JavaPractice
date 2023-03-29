package depoYonetimiYusuf;


import java.util.HashMap;
import java.util.Scanner;

import static depoYonetimiYusuf.TryCatch.secimTry;


public class Islemler {
    static Scanner scan = new Scanner(System.in);
    static int id =1000; //

    static HashMap<Integer , Urunler> urunler = new HashMap<>();

    public static void menu() {
        System.out.println("1-urun tanimlama \n 2-Miktar guncelleme \n 3- Raf guncelleme\n" +
                " 4-Urun cikis\n 5-Urun listele\n 6-cikis");

    int secim = TryCatch.secimTry(); // bu kisim icin try-catch acilmali
    switch (secim) {
        case 1:
            urunTanımla();
            break;
        case 2:
            miktarGuncelle();
            break;
        case 3:
            rafGuncelleme();
            break;
        case 4:
            urunCikis();
            break;
        case 5:
            urunListele(urunler);
            break;
        case 6:
            cikis();
            break;
        default:
            System.out.println("islem yapilamadi");
            break;
    }
}

    private static void urunListele(HashMap<Integer, Urunler> urunler) {
        urunler.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
        //System.out.println();
        menu();

    }


    private static void urunCikis() {
        System.out.println("Satilacak malin id ve miktari:");
        int girilenId = scan.nextInt();
        int satilacakMiktar = scan.nextInt();
        if(satilacakMiktar > urunler.get(girilenId).getMiktar()) {
            System.out.println("Olandan fazla deger girdiniz!");
        }else {
            // get ile miktari al ve cikar
            urunler.get(girilenId).setMiktar(satilacakMiktar); // TODO : guncel miktardan girilen deger cikarilacak
        }
        System.out.println("Id " + girilenId + " malzemeden su kadar:" + satilacakMiktar + " satildi");
        menu();

    }

    private static void cikis() {
        System.out.println("Gorusuruz");
    }

    private static void urunTanımla() {
        System.out.print("uruni smini giriniz : ");
        String urunIsim = scan.nextLine();
        scan.nextLine();
        System.out.print("uretici bilgisi giriniz : ");
        String uretici = scan.nextLine();
        System.out.print("urun birimi giriniz : ");
        String birim = scan.nextLine();

        System.out.print("urun miktar giriniz : ");
        int miktar = scan.nextInt();
        scan.nextLine();
        System.out.print("urun icin raf  giriniz : ");
        int raf = scan.nextInt();

        Urunler urun = new Urunler(urunIsim, uretici, miktar, birim, raf);
        urunler.put(id, urun);
        System.out.println(id + " : " + urunler.get(id));
        id++;
        menu();
    }
    private static void miktarGuncelle() {
        System.out.print("Guncellenecek urun id'sini giriniz : ");
        int arananId = scan.nextInt();
        if (urunler.keySet().contains(arananId)) {
            System.out.print("ekleme yapilacak  miktar : ");
            int guncelMiktar = scan.nextInt();
            urunler.get(arananId).setMiktar(guncelMiktar + urunler.get(arananId).getMiktar());

            System.out.println("Miktar guncellendi. Guncel deger: " + urunler.get(arananId).getMiktar());
        } else System.out.println("aradıgınız urun yok");
        menu();
    }

    private static void rafGuncelleme() {
        System.out.println("Istenilen urun id ve yeni raf degerini giriniz: ");
        // TODO : Bu kisimlara try-catch kullanilacak
        int girilenId = scan.nextInt();
        int yeniRaf = scan.nextInt();
        urunler.get(girilenId).setRaf(yeniRaf);
        menu();
    }








    }
