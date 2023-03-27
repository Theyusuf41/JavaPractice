package j32_Maps.Task;

public class Task02_Kartvizit { // pojo class -> kartvizit ureticez

    String isim;
    String email;
    String adres;
    String telefon;
    int id=100;

    public Task02_Kartvizit(String isim, String email, String adres, String telefon) {
        this.isim = isim;
        this.email = email;
        this.adres = adres;
        this.telefon = telefon;
        this.id++; // id her seferinde artsin diye
    }

    @Override
    public String toString() {
        return  isim + '\'' +
                ", email='" + email + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'';
    }
}
