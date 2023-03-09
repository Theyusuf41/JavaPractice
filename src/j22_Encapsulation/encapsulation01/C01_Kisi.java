package j22_Encapsulation.encapsulation01;

public class C01_Kisi { // PoJo Class
    private String ad;
    private String soyad;
    private String password;
    private int yas;


    public C01_Kisi(String ad, String soyad, String password, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.password = password;
        this.yas = Math.abs(yas);
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getPassword() {
        return password;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setYas(int yas) {
        this.yas = Math.abs(yas);
    }

    public int getYas() {
        return yas;
    }

    @Override
    public String toString() {
        return
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", password='" + password + '\'' +
                ", yas=" + yas;
    }
}
/* task
Kisi pojo class için fields-> ad, soyad, password(String), yas
tum field'ları kullanıcı görebilmeli ve password haric update edebilmeli
(password encapsulated update edilmemeli.)
yas variable negatif değer girmeye karsı encapsulated

runner class'da obj ile field ları print eden code create ediniz
 */