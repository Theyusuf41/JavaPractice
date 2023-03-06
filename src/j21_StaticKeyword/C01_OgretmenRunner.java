package j21_StaticKeyword;

public class C01_OgretmenRunner {
    public static void main(String[] args) {

        C01_Ogretmen ogrtm1 = new C01_Ogretmen("Yusuf", 3);
        C01_Ogretmen ogrtm2 = new C01_Ogretmen("Ali", 7);
        C01_Ogretmen.okul = "nuh cimento";
        System.out.println(ogrtm1.isim);
        System.out.println(ogrtm2.isim);

    }
}
