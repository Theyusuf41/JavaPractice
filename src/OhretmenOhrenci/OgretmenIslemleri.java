package OhretmenOhrenci;

import java.util.Scanner;

import static PROLECTS.ogrcOgrtYonetimiMap01.AnaMenu.girisPaneli;
import static PROLECTS.ogrcOgrtYonetimiMap01.AnaMenu.işlemMenu;
import static PROLECTS.ogrcOgrtYonetimiMap01.AnaMenu.kimlikIDKontrol;

public class OgretmenIslemleri implements Ogrt_OğrcIslemleri {
    static Scanner input = new Scanner(System.in);
    static   OgretmenIslemleri ogrtIslem =new OgretmenIslemleri();
    public  static  void ogretmenIslemMenu(){


        işlemMenu();
        System.out.print("ÖĞRETMEN işleminizi seçiniz : ");

        //int scm = TryCatches.integerGiris();               //try catch


        switch (TryCatches.integerGiris()) {

            case 1:
                ogrtIslem.ekleme();

                break;
            case 2:
                ogrtIslem.arama();

                break;
            case 3:
                ogrtIslem.listeleme();

                break;
            case 4:
                ogrtIslem.silme();

                break;
            case 5:
                ogrtIslem.anaMenu();

                break;
            case 6:
                ogrtIslem.cikis();

                break;
            default :
                System.out.println("lütfen geçerli bir giriş yapınız");

                ogretmenIslemMenu();
                break;

        }
    }




    @Override
    public void ekleme(){
        System.out.println("kimlik numarası giriniz");
        String kimlikID = input.next();
        kimlikIDKontrol(kimlikID);
        System.out.println("adSoyad yas bolum sicil giriniz");
        // System.out.println("adSoyad");
        input.nextLine();
        String adSoyad = input.nextLine();
        System.out.println("yas");
        String yas = input.next();
        System.out.println("bolum");
        String bolum = input.next();
        System.out.println("sicil");
        String sicil = input.next();
        Ogretmen.ogretmenListesiMap.put(kimlikID, new Ogretmen(adSoyad, yas, bolum, sicil));

        System.out.println("ÖĞRETMEN İŞLEM MENÜSÜNE AKTARILIYORSUNUZ ...");
        ogretmenIslemMenu();
    }





    @Override
    public void arama() {
        System.out.print("aradıgını ÖĞRETMEN kimlik numarası giriniz : ");
        String kimlikID = input.next();
        if (Ogretmen.ogretmenListesiMap.containsKey(kimlikID)) {
            // if (Ogrenci.ogrenciListesiMap.containsKey( input.next())) {
           // System.out.println("aradıgınız ÖĞRETMEN : "+Ogretmen.ogretmenListesiMap.get( input.next()));
            System.out.println("aradıgınız ÖĞRETMEN : "+Ogretmen.ogretmenListesiMap.get(kimlikID));
        } else  System.out.println("aradıgınız ÖĞRETMEN  kayıtlı degil ");
        System.out.println("ÖĞRETMEN İŞLEM MENÜSÜNE AKTARILIYORSUNUZ ...");
        ogretmenIslemMenu(); }

    @Override
    public void listeleme() {
        System.out.println(Ogretmen.ogretmenListesiMap);
        System.out.println("ÖĞRETMEN İŞLEM MENÜSÜNE AKTARILIYORSUNUZ ...");
        ogretmenIslemMenu();
    }

    @Override
    public void silme() {
        System.out.print("silinecek ÖĞRETMEN kimlik numarası giriniz : ");
         String kimlikID = input.next();
        if (Ogrenci.ogrenciListesiMap.containsKey(kimlikID)) {
        //if (Ogretmen.ogretmenListesiMap.containsKey( input.next())) {
            System.out.println("sildiğiniz ÖĞRETMEN : "+Ogretmen.ogretmenListesiMap.remove( kimlikID));
        } else System.out.println("silinecek ÖĞRETMEN  kayıtlı degil...");

        System.out.println("ÖĞRETMEN İŞLEM MENÜSÜNE AKTARILIYORSUNUZ ...");
        ogretmenIslemMenu();
    }

    @Override
    public void anaMenu() {
        girisPaneli();
    }

    @Override
    public void cikis() {
        System.out.println("Ogretmen - Öğrenci Yonetimi uygulama çıkışınız yapılmıştır selametle...");
    }

}
