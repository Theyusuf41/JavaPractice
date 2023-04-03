package OgretmenOgrencıZusuf;

import java.util.HashMap;
import java.util.Map;

public class Ogretmen extends Kisi{
    private String bolum;
    private String sicilNo;

    static Map<String, Ogretmen> ogretmenListesi = new HashMap<>();// Ogretmen objesini kimlik ile mape bagladik
    public Ogretmen(String adSoyad, String kimlikNo, Integer yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum.toUpperCase();
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                ", ogretmenListesi=" + ogretmenListesi +
                "} " + super.toString();
    }
}
