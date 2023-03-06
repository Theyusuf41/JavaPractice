package j21_StaticKeyword;

public class C03_StaticKeyword {
    int ogrenciId;

    static int ogrenciSayisi;

    public C03_StaticKeyword() {
        ogrenciSayisi++;  // static aldigi icin her objectte yeni deger alir
        ogrenciId += ogrenciSayisi; // ogrenci Id her seferinde degisir.
    } // parametresiz const
    public static void main(String[] args) {
        System.out.println(ogrenciSayisi);
        C03_StaticKeyword a = new C03_StaticKeyword();
        System.out.println(ogrenciSayisi);
        C03_StaticKeyword b = new C03_StaticKeyword();
        C03_StaticKeyword c = new C03_StaticKeyword();
        C03_StaticKeyword d = new C03_StaticKeyword();
        C03_StaticKeyword e = new C03_StaticKeyword();
        System.out.println(ogrenciSayisi + " yeni objeler yaratildiktan sonraki print**" );
        System.out.println(e.ogrenciId  );


    }
}
