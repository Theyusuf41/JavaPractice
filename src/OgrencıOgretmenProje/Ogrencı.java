package OgrencıOgretmenProje;

public class Ogrencı extends Kisi {
    private String numara;
    private String sinif;

    public Ogrencı() {
    }

    public Ogrencı(String adSoyad, String kimlikNo, int yas, String numara, String sinif) {  // full parametrized parent constructor
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
        return   super.toString() +
                "numara='" + numara + '\'' +
                ", sinif='" + sinif + '\'';
    }

}
