package j34_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Match {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("küşleme",  "soğanlı", "trileçe", "bicibici", "büryan", "Welemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        yedidenAzMi(l1);
        System.out.println("\n ***** ****** *****");
        wBaslamama(l1);
        System.out.println("\n ***** ****** *****");
        xBitis(l1);

    }

    public static void xBitis(List<String> l1) {
        // Task03-> List elemanlarinin "x" ile biten en az bir elemanın varlığını kontrol ediniz eden code create ediniz...->
        System.out.println(l1.stream()
                .anyMatch(t -> t.endsWith("x")) ? "Bir tanesi x ile bitiyor" : "Hicbiri x ile bitmiyor");

    }

    public static void wBaslamama(List<String> l1) {
        // Task02-> List elemanlarinin "W" ile baslamamasını kontrol eden code create ediniz...->noneMatch
        System.out.println(l1.stream()
                .noneMatch(t -> t.startsWith("W")) ? "W ile baslamiyor" : " En az bi tanesi W ile basliyor");
        //l1.stream().noneMatch(t -> t.toString().substring(0,1).equalsIgnoreCase("W")))?"Agam menude hiç bir yemahh W ile başlameyyo :)":"Agam menude W ile başlayan enz bir yemahhh var :(";
    }

    public static void yedidenAzMi(List<String> l1) {
        // Task01 ->  List elemanlarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol eden code create ediniz.
        System.out.println(l1.stream()
                .anyMatch(t -> t.length() <= 7) ? "Yediden buyuk eleman var" : "Maalesef yok");
                /*.map(String::length)
                .filter(t-> t<=7)
                .forEach(t-> System.out.println(t)); */
    }
}
//anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
//allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
//noneMatch()--> hic bir eleman sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.