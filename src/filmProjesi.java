import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filmProjesi {
    static List<String> filmler = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));

    public static void main(String[] args) {
        System.out.println("Film secme oyununa hosgeldiniz: ");
        System.out.println("1- " + (filmler.size()) + " secme hakkiniz vardir");


    }
}
/*
     TASK :
      yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      filmin index nosuna göre sectiriniz
      seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
      sağlayan method create ediniz...
      Ahanda TRICK...
      kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.


      1. adım: kullanıcıya film listesinden bir film seçtir.
      kullanıcı filmi seçerken hangi film olduğunu görmeyecek,
      numarasına göre seçecek.

     2. adım: filmGetir(); metodu oluştur.

      3. adım: harfleri "-" ile değiştir ve yazdır,
      filmin kaç harfli olduğunu yazdır.
      "JOKER" seçildiyse "-----" olarak gözüksün

      4. adım: filmdeki harf sayısına göre tahmin hakkı verilir.
        5 harfli film için 5*2 yani 10 tahmin hakkı

      5. adım: yanlış tahmin sayısını say

      6. adım: film için tahmin edilen harf al

      7. adım: harf filmin içinde bulunmuyorsa yanlış
       tahmin sayısını bir artır,
       bulunuyorsa harfin yerini göster
+
      8. adım: kazandınız veya kaybettiniz yazdır
     */