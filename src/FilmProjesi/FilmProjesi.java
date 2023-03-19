package FilmProjesi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmProjesi {
    static List<String> filmler = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1 - " + filmler.size() + " arasinda bir sayi seciniz: ");
        int filmSecimi = scanner.nextInt();
        filmGetir(filmSecimi-1, filmler);
    }

    public static void filmGetir(int filmSecimi, List<String> filmler) {
        String tahminEdilecekFilm = filmler.get(filmSecimi).replaceAll("\\w", "-");
        System.out.println(tahminEdilecekFilm);
        int can = tahminEdilecekFilm.length() * 2;
        char harf =' ';
        String str = " ";

        while(can>=0){
            System.out.println("Harf giriniz: \n kalan hakkiniz: " + can);
            harf = scanner.next().toUpperCase().charAt(0);
            str+=harf;
            if(!tahminEdilecekFilm.contains(str)){
                can--;
                break;
            }else {
                for (int i = 0; i <tahminEdilecekFilm.length() ; i++) {
                    if(tahminEdilecekFilm.charAt(i)== harf){
                        tahminEdilecekFilm=tahminEdilecekFilm.substring(0,i)+harf+tahminEdilecekFilm.substring(i+1);

                    }
                }
                System.out.println(tahminEdilecekFilm);
            }
        }


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
​
​
      1. adım: kullanıcıya film listesinden bir film seçtir.
      kullanıcı filmi seçerken hangi film olduğunu görmeyecek,
      numarasına göre seçecek.
​
      2. adım: filmGetir(); metodu oluştur.
​
      3. adım: harfleri "-" ile değiştir ve yazdır,
      filmin kaç harfli olduğunu yazdır.
      "JOKER" seçildiyse "-----" olarak gözüksün
​
      4. adım: filmdeki harf sayısına göre tahmin hakkı verilir.
        5 harfli film için 5*2 yani 10 tahmin hakkı
​
      5. adım: yanlış tahmin sayısını say
​
      6. adım: film için tahmin edilen harf al
​
      7. adım: harf filmin içinde bulunmuyorsa yanlış
       tahmin sayısını bir artır,
       bulunuyorsa harfin yerini göster
​
      8. adım: kazandınız veya kaybettiniz yazdır
     */