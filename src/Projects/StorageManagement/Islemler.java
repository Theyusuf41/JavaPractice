package Projects.StorageManagement;

import java.util.Scanner;

public class Islemler {
    static Scanner input = new Scanner(System.in);
    static Depo depo = new Depo(); // Depodaki methodlari call etmek icin obje create edildi

    public static void girisEkrani() {
        System.out.println(" ----------Islemler---------- \n"
        + "1-Urun Listesi \n2-Urun Tanimla\n3-Urun Raflama\n4-Urun Giris\n5-Urun Cikis\n6-Cikis \n----------------------------" );

        System.out.println("Islem seciniz: ");
        int secim = input.nextInt();
        switch (secim) {
            case 1:
                urunListesi();
                break;
            case 2:
                urunTanimlama();
                break;
            case 3:
                urunRaflama();
                break;
            case 4:

                break;
            case 5:

                break;
            case 6:
                cikis();
                break;
        }


    }

    private static void urunRaflama() {
        System.out.println("Urununuzun Id ve atanacak raf degerini giriniz: ");
        int rafAtanacakId = input.nextInt();
        input.nextLine();
        if(depo.urunList.contains(depo.urunList.get(rafAtanacakId - UrunTanimla.idAtaIlk))) {
            depo.urunRafTanimla(rafAtanacakId, input.nextInt());
            girisEkrani();
        }else {
            System.out.println("Olmayan id girildi");
            urunRaflama();
        }
    }


    private static void urunListesi() {
        //System.out.println(depo.urunList);
        depo.urunList.stream().forEach(t-> System.out.printf("" + t.getUrunId() , t.getUrunIsim() , t.getUretici() , t.getUrunMiktar() , t.getMiktarBirimi() , t.getRafNo()));
        System.out.println();
        girisEkrani();
    }

    private static void urunTanimlama() {
        System.out.println("urun ismi , uretici ve birimi giriniz :");
        String urunIsmi = input.next();
        depo.urunTanimla(urunIsmi, input.next(), input.next());
        System.out.println("Depoda yeni urun tanimlandi. UrunId no: " + depo.urunList.get(depo.urunList.size()-1).getUrunId() );
        girisEkrani();
    }

    private static void cikis() {
        System.out.println("Tschusss");
    }
}
