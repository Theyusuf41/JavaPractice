package j29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(34,35,41,58,31,7,38,61));
        System.out.println("l1 ilk hali " + l1);

        // bastan sona
        ListIterator<Integer> it1 = l1.listIterator();
        while(it1.hasNext()) { // bastan sona dogru ilerler
            System.out.print(it1.next() + " ");
        }
        System.out.println();

        // sondan basa
        while(it1.hasPrevious()) { // bastan sona dogru ilerler
            System.out.print(it1.previous() + " ");
        }
        System.out.println();
        List<String> l2 = new ArrayList<>(Arrays.asList("Baklava", "Gullac", "Profiterol" , "Roket"));
        // l2 elemanlarinin sonuncusununa :) seklinde update edip create ediniz.
       ListIterator it2 = l2.listIterator();
        while(it2.hasNext()){
            it2.next();
            if (it2.hasNext()==false){
                it2.previous();
                it2.set(it2.next()+":)");
            }
        }
        System.out.println(l2);



        /*
            task -> Verilen bir integer listin tek  elemanrının karesini tersten iteartor  print eden code create ediniz
        */

        /*  task->
   Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
   elementleri silip print eden code create ediniz
   (2. liste olusturmadan, gecerli liste uzerinde iterator ile islem yapiniz)
Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
output: [23,40]
    */
    }
}
