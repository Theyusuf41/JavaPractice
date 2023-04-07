package Day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaCodeChallenge {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5,-8,-2,-12,0,1,12,5,6,9,15,8));

        bosluklaYazdir(list);
        System.out.println("\n 1. task sonu *** ****");
        System.out.println(negatifYazdir(list));
        System.out.println("2. task sonu *** ****");
        pozitifYazdir(list);
        System.out.println("\n 3. task sonu *** ****");
        System.out.println(karealListYap(list));
        System.out.println("4. task sonu *** ****");
        System.out.println(tekrarsizKare(list));
        System.out.println("5. task sonu *** ****");
        kucuktenBuyuge(list);
        System.out.println("\n 6. task sonu *** ****");


    }

    private static void kucuktenBuyuge(List<Integer> list) {
        // Task 06 -> kucukten buyuge siralayin

        list.stream().sorted().forEach(t-> System.out.print(t  + " "));
    }

    private static List<Integer> tekrarsizKare(List<Integer> list) {
        // Task 05 -> kareleri al ama tekrarsiz olsun

        return list.stream()
                .map(t-> t*t)
                .distinct().collect(Collectors.toList());
    }

    private static List<Integer> karealListYap(List<Integer> list) {
        // Task04 -> karelerinden yeni bir list olustur
        return list.stream()
                .map(t-> t*t).collect(Collectors.toList());
    }

    private static void pozitifYazdir(List<Integer> list) {
        // Task03 -> negatif sayilarin ciktisini alin
        list.stream()
                .filter(t-> t>0).forEach(t-> System.out.print(t + " "));
    }

    private static List<Integer> negatifYazdir(List<Integer> list) {
        // Task02 -> negatif sayilarin ciktisini alin
        return list.stream().filter(t-> t<0).collect(Collectors.toList());

    }

    private static void bosluklaYazdir(List<Integer> list) {
        // Task01 -> elemanlari aralarinda bosluk birakarak yazdiriniz.
        list.stream().forEach(t-> System.out.print(t + " "));

    }
}
