package j33_Enum.enum04;

public enum Aylar {
    OCAK(31),
    SUBAT(28),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31);

    int gunSayisi ;

    //Aylar(int gunSayisi , String mevsim , String birthday) { // enum fieldlara parametre tanimlandi}
    Aylar(int gunSayisi) { // enum fieldlara parametre tanimlandi}
        this.gunSayisi=gunSayisi;
    }

    void   gunMiktari() {
        System.out.println(gunSayisi);
    }
}
