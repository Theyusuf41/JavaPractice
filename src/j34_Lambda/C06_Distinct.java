package j34_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_Distinct {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("tatli", "ivir", "zibir", "bal", "dokqqqqqqqqq" ,"yala","tatli"));
        buyukHarfTekrarsiz(l1);
        System.out.println("\n ***** ****** *****");
        karakterSayisi(l1);
    }
    public static void buyukHarfTekrarsiz(List<String>l1){
        // Task-> list elemanlarini buyuk harf benzersiz ve alfabetik hale getir
        l1.stream()
                .sorted()
                .map(String::toUpperCase)
                .distinct()
                .forEach(t-> System.out.println(t));

    }

    public static void karakterSayisi(List<String>l1){
        // Task-> list elemanlarini karakter sayilarini ters olarak print et
        l1.stream()

                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .forEach(t-> System.out.println(t));

    }
}
