package j34_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_Sorted {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(7,3,11,4,12,1,5,17,2));
        kucuktenBuyuge(l1);
        System.out.println("\n task'ler arasi bosluk ****");
        buyuktenKucuge(l1);
    }


    public static void buyuktenKucuge(List<Integer> l1) {
        // Task -> tek elemanlarin karesi ardindan buyukten kucuge siralama
        l1.stream()
                .filter(t -> t%2==1)
                .map(t-> Math.pow(t,2))
                .sorted(Comparator.reverseOrder())
                .forEach(t-> System.out.println(t));
    }

    public static void kucuktenBuyuge(List<Integer> l1) {
        // Task->cift elemanlarin karesi ardindan kucukten-buyuge siralama

                l1.stream()
                        .filter(t-> t%2==0)
                        .map(t->Math.pow(t,2))
                        .sorted()
                        .forEach(t-> System.out.println(t));
    }


}
