package OhretmenOhrenci;

import java.util.Scanner;

import static OhretmenOhrenci.AnaMenu.*;


public class OgrenciIslemleri implements Ogrt_OğrcIslemleri{
    static Scanner input = new Scanner(System.in);
  static   OgrenciIslemleri ogrcIslemObj =new OgrenciIslemleri();//class içindeki non-static meth coll etmek için obj create edildi
   public  static  void  ogrenciIslemMenu(){


       işlemMenu();

       System.out.print("ÖĞRENCİ işleminizi seçiniz : ");

       //int scm = TryCatches.integerGiris();               //try catch


       switch (TryCatches.integerGiris()) {

           case 1:
               ogrcIslemObj.ekleme();

               break;
           case 2:
               ogrcIslemObj.arama();

               break;
           case 3:
               ogrcIslemObj.listeleme();

               break;
           case 4:
               ogrcIslemObj.silme();

               break;
           case 5:
               ogrcIslemObj.anaMenu();

               break;
           case 6:
               ogrcIslemObj.cikis();

               break;
           default :
               System.out.println("lütfen geçerli bir giriş yapınız");

               ogrenciIslemMenu();
               break;

   }
   }




    @Override
    public void ekleme(){
           System.out.println("kimlik numarası giriniz");
           String kimlikID = input.next();
           kimlikIDKontrol(kimlikID);
           System.out.println("adSoyad yas numara sinif giriniz");
           // System.out.println("adSoyad");
           input.nextLine();
           String adSoyad = input.nextLine();
           System.out.println("yas");
           String yas = input.next();
           System.out.println("Numara");
           String numara = input.next();
           System.out.println("sinif");
           String sinif = input.next();
           Ogrenci.ogrenciListesiMap.put(kimlikID, new Ogrenci(adSoyad, yas, numara, sinif));

        System.out.println("ÖĞRENCİ İŞLEM MENÜSÜNE AKTARILIYORSUNUZ ...");
        ogrenciIslemMenu();
       }





    @Override
    public void arama() {
        System.out.print("aradıgını öğrenci kimlik numarası giriniz : ");
     String kimlikID = input.next();

       if (Ogrenci.ogrenciListesiMap.containsKey(kimlikID)) {
       // if (Ogrenci.ogrenciListesiMap.containsKey( input.next())) {
           // System.out.println("aradıgınız öğrenci : "+Ogrenci.ogrenciListesiMap.get( input.next()));
            System.out.println("aradıgınız öğrenci : "+Ogrenci.ogrenciListesiMap.get( kimlikID));
        } else  System.out.println("aradıgınız öğrenci  kayıtlı degil ");
        System.out.println("ÖĞRENCİ İŞLEM MENÜSÜNE AKTARILIYORSUNUZ ...");
        ogrenciIslemMenu(); }

    @Override
    public void listeleme() {
        System.out.println(Ogrenci.ogrenciListesiMap);
        System.out.println("ÖĞRENCİ İŞLEM MENÜSÜNE AKTARILIYORSUNUZ ...");
        ogrenciIslemMenu();
    }

    @Override
    public void silme() {
        System.out.print("silinecek öğrenci kimlik numarası giriniz : ");
         String kimlikID = input.next();
        //if (Ogrenci.ogrenciListesiMap.containsKey(kimlikID)) {
        if (Ogrenci.ogrenciListesiMap.containsKey( kimlikID)) {
            System.out.println("sildiğiniz öğrenci : "+Ogrenci.ogrenciListesiMap.remove(kimlikID));
        } else System.out.println("silinecek öğrenci  kayıtlı degil...");

        System.out.println("ÖĞRENCİ İŞLEM MENÜSÜNE AKTARILIYORSUNUZ ...");
        ogrenciIslemMenu();
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
