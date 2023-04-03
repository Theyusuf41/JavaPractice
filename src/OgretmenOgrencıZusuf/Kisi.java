package OgretmenOgrencıZusuf;

public class Kisi { // GrandParent POJO class

    private String adSoyad;
    private String kimlikNo;
    private Integer yas;

    public Kisi(String adSoyad, String kimlikNo, Integer yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad.toUpperCase();
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }
}
