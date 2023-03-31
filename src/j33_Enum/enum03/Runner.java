package j33_Enum.enum03;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Kitap ktp1 = new Kitap();
        ktp1.name= "lord of the rings";
        //ktp1.kategori= "roman";
        ktp1.tur = Kategori.ROMAN;

        Kitap ktp2 = new Kitap();
        ktp2.name= "aasdad";
        //ktp2.kategori= "hikaye";
        ktp2.tur = Kategori.TARIH;


        Kitap ktp3 = new Kitap();
        ktp3.name= "qwe";
        //ktp3.kategori= "deneme";
        ktp3.tur = Kategori.TEKNOLOJI;
        ArrayList<Kitap> k1 = new ArrayList<>(Arrays.asList(ktp3,ktp2,ktp1));


        for (Kitap k: k1 ) {
            if(k.tur== Kategori.ROMAN)
                System.out.println(k.name);
        }

    }
}
/*  TASK :
1- Bir Kitap calss'i create ediniz, fields : name ve kategori(Enum)
2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
3- 3 kitap tanımlayınız bir ArrayList e atınız.
4- bir kategoriye gore listeletiniz.
*/