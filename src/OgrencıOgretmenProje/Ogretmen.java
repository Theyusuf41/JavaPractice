package OgrencıOgretmenProje;

public class Ogretmen extends Kisi{ // Parent class'tan extend ettik.
    private String  sicilNo;
    private String  bolüm;

    public Ogretmen() {
    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String sicilNo, String bolüm) {
        super(adSoyad, kimlikNo, yas); // full parametrized parent constructor
        this.sicilNo = sicilNo;
        this.bolüm = bolüm;
    }


    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getBolüm() {
        return bolüm;
    }

    public void setBolüm(String bolüm) {
        this.bolüm = bolüm;
    }

    @Override
    public String toString() {
        return  super.toString() + //  bu sekilde parent class'taki methodlari call edebiliriz.
                "sicilNo='" + sicilNo + '\'' +
                ", bolüm='" + bolüm + '\'';
    }

}
