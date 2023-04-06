package j34_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C08_Limit {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("küşleme", "soğanlı", "trileçe", "bicibici", "büryan", "Welemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        enBuyukElemaniAl(l1);

    }

    public static void enBuyukElemaniAl(List<String> l1) {
       l1.stream().sorted(Comparator.comparing(String::length).reversed()).limit(1).forEach(t-> System.out.println(t));
    }
}
// Task01-> list elemanlarının karakter sayısı en buyuk olanı print code create ediniz...
//limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır.