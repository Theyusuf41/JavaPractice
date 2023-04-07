package Projects.StorageManagement.OgretmenOgrencıZusuf;

import java.util.HashMap;
import java.util.Map;

public class Ogrenci extends Kisi {
    private String numara;
    private String sinif;

    static Map<String, Ogrenci> ogrenciListesi = new HashMap<>(); // olusturulan String yani kimlik ile Ogrenci objesini baglayacak Map yapmak


    public Ogrenci(String adSoyad, String kimlikNo, Integer yas, String numara, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "numara='" + numara + '\'' +
                ", sinif='" + sinif + '\'' +
                "} " + super.toString();
    }
}
