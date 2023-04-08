package Projects.StorageManagement.MaasHesaplama.YusufVersion;

import static Projects.StorageManagement.MaasHesaplama.YusufVersion.Islemler.scan;

public class SwitchIslemleri {
    public static void SwitchIslemleri() {
        System.out.println("Menuye hosgeldiniz!! \n1-Kisi Ekleme\n2-Vergi Hesaplama\n3-BonusHesaplama\n4-Maas Artisi\n5-Listele");
        int islem = scan.nextInt();

        switch (islem) { // TODO: try-catch kullanilmali!
            case 1: Islemler.calisanTanimla();
            break;
            case 2: Islemler.vergiHesaplama();
                break;
            case 3: Islemler.bonusHesapla();
                break;
            case 4: Islemler.maasArtisi();
                break;
            case 5: Islemler.listele();
                break;
            default:
                System.out.println("Yanlis deger girdiniz bayim !");

        }
    }
}
