package OgrencıOgretmenProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static List<Kisi> ogretmenList = new ArrayList<>(); // create edilecek ogretmen objesini saklayacak bos List assign edildi.
    static List<Kisi> ogrenciList = new ArrayList<>(); // create edilecek ogrenci objesini saklayacak bos List assign edildi.

    static Scanner scanner = new Scanner(System.in); // her yerden erisebilmek icin static ekledik...
    static String kisiTuru;

    public static void girisPaneli(){
        System.out.println("******  Ogrenci ve Ogretmen Ana Menü *******");
        System.out.println(" 1-Ogrenci islemleri \n 2-Ogretmen islemleri \n Q Cikis");
        System.out.println("Yapmak istediginiz islemi giriniz: ");
        switch (scanner.nextLine().toUpperCase()) {
            case "1":
                kisiTuru="OGRENCI";
                islemMenu();
                break;
            case "2":
                kisiTuru="OGRETMEN";
                islemMenu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Hatali islem yapildi. Tekrar deneyiniz! ");
                girisPaneli(); // recursive method.
                break;

        }

    }

    private static void islemMenu() {
        System.out.println("Sectiginiz kisi turu" +kisiTuru + " , Lutfen asagidaki islemlerden tercih yapiniz. \n 1-Ekleme\n 2-Arama\n 3- Listeleme\n 4-Silme\n 0-Ana Menu\n Islem tercihinizi giriniz: ");

        switch (scanner.nextInt()) {
            case 1:
                ekle();
                islemMenu();
                break;
            case 2:
                ara();
                islemMenu();
                break;
            case 3:
                listele();
                break;
            case 4:
                sil();
                islemMenu();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("Hatali giris yapildi: ");
                islemMenu(); // recursive meth.
                break;
        }


    }

    private static void sil() {
        if (kisiTuru.equalsIgnoreCase("ogrenci")) {
            System.out.println("Silinecek ogrencinin kimlik no'sunu giriniz: ");
            for (Kisi k: ogrenciList) {
                if(k.getKimlikNo().equals(scanner.next())){
                    ogrenciList.remove(k);
                    System.out.println("Ogrenci silinmistir.");
                    break;
                }else System.out.println("Ogrenci bulunamamistir.");
            }
        } else {
            System.out.println("Silinecek ogretmenin kimlik no'sunu giriniz: ");
            for (Kisi k : ogretmenList) {
                if (k.getKimlikNo().equals(scanner.next())) {
                    ogretmenList.remove(k);
                    System.out.println("Ogretmen silinmistir.");
                    break;
                } else System.out.println("Ogretmen bulunamamistir.");

            }
        }
    }

    private static void listele() {
        System.out.println("*** " +kisiTuru +" listeleniyor ***");
        if(kisiTuru.equalsIgnoreCase("ogrenci")){
            System.out.println(ogrenciList);
        }else System.out.println(ogretmenList);
        islemMenu();
    }

    private static void ara() {
        if(kisiTuru.equalsIgnoreCase("ogrenci")){
            System.out.println("Aranan Ogrencinin kimlik no'sunu giriniz: ");
            for (Kisi x: ogrenciList ) {
                if(x.getKimlikNo().equals(scanner.next())){
                    System.out.println("Aranan ogrenci mevcut");
                    break;
                }else System.out.println("Aranan ogrenci mevcut degil!");
            }
        }else {
            System.out.println("Aranan Ogretmen kimlik no'sunu giriniz: ");
            for (Kisi x: ogretmenList ) {
                if(x.getKimlikNo().equals(scanner.next())){
                    System.out.println("Aranan ogretmen mevcut");
                    break;
                }else System.out.println("Aranan ogretmen mevcut degil!");
            }

        }

    }

    private static void ekle() {
        if(kisiTuru.equalsIgnoreCase("ogrenci")){
            System.out.println("ad-soyad giriniz: ");
            String ogrenciAdSoyad = scanner.next();
            scanner.nextLine(); // dummy code
            System.out.println("kimlik no giriniz: ");
            String ogrenciKimlikNo = scanner.next();
            System.out.println("yas  giriniz: ");
            int ogrenciYas = scanner.nextInt();
            System.out.println("numara  giriniz: ");
            String ogrenciNum = scanner.next();
            scanner.nextLine(); // dummy code
            System.out.println("sinif  giriniz: ");
            String ogrenciSinif = scanner.next();
            Ogrencı ogrenci = new Ogrencı(ogrenciAdSoyad,ogrenciKimlikNo,ogrenciYas,ogrenciNum,ogrenciSinif);
            ogrenciList.add(ogrenci);
             System.out.println("Girilen ogrenci: " + ogrenci.getAdSoyad() + " basari ile kayit olmustur. \n islem menusune yonlendiriliyorsunuz -> ");

        }else {
            System.out.println("ad-soyad giriniz: ");
            String ogretmenAdSoyad = scanner.next();
            scanner.nextLine(); // dummy code
            System.out.println("kimlik no giriniz: ");
            String ogretmenKimlikNo = scanner.next();
            System.out.println("yas  giriniz: ");
            int ogretmenYas = scanner.nextInt();
            System.out.println("numara  giriniz: ");
            String ogretmenSicilNo = scanner.next();
            scanner.nextLine(); // dummy code
            System.out.println("sinif  giriniz: ");
            String bolum = scanner.next();
            Ogretmen ogretmen = new Ogretmen(ogretmenAdSoyad,ogretmenKimlikNo,ogretmenYas,ogretmenSicilNo,bolum);
            ogretmenList.add(ogretmen);
            System.out.println("Girilen ogretmen: " + ogretmen.getAdSoyad() + " basari ile kayit olmustur. \n islem menusune yonlendiriliyorsunuz -> ");

        }

    }

    private static void cikis() {
        System.out.println("Yine bekleriz... Gorusuruz! ");
    }


}
