package j29_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>(Arrays.asList("Harika" , "Eda" , "Ceren" , "Yusuf"));
        System.out.println(l1 + " ilk hali");

        // Task01 ->  l1 elemanlarini for loop ile print ediniz:

        for (int i = 0; i < l1.size(); i++) {
            System.out.println("list1.get(i) = " + l1.get(i));
        }

        // Task02 ->  l1 elemanlarini for-each loop ile print ediniz:
        for (String str :l1) {
            System.out.println(str + " ");

        }

        // Task03 ->  herbir l1 elemanlarini gulen surat for loop ile update ediniz:
        for (int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i) + " :)");
        }
        System.out.println(l1 + " gulen suratli ");


        // Task04 ->  herbir l1 elemanlarini aglayan surat for-each loop ile update ediniz:
        for (String str:l1 ) {
            str+= " :(";
        }
        System.out.println(l1 + " aglayan suratli ");
        System.out.println();

        System.out.println("**** Iteration kullanimi  *****");

        Iterator<String> it1 = l1.iterator(); // l1 list elemanlari tekrara alinmasi icin Iterator kullaniyoruz.
        /*while(it1.hasNext()){ // hasNext methodu verilen elemanlar icin bir sonraki elemanin varligini kontrol eder true-false doner
            System.out.println(it1.next()); // bir sonraki elemani getirir.
        } */


        // Task05 -> l1 elemanlarini silip print eden code create ediniz
        while(it1.hasNext()) {
            it1.next();
            it1.remove();
        }
        System.out.println(" *** task 05   ***");
        System.out.println(l1);

        // Task06 -> l2'in elemanlarını :-) update edip  print code create ediniz..
        List<String> l2 = new ArrayList<>(Arrays.asList("Javacan" , "String" , "Integer" , "Yusuf"));
        ListIterator<String> it3 = l2.listIterator();
        while(it3.hasNext()) {
            it3.set(it3.next() + " :))");
        }
        System.out.println(l2 + " listIterator ");

        // Task07 -> l2'in elemanlarını ilk harfi buyuk harf karakteri kalan harfleri *** ile update edip l3 ekleyip  print code create ediniz..
        ListIterator<String> it4 = l2.listIterator();
        while(it4.hasNext()){
            it4.set(it4.next().substring(0,1).toUpperCase() + "***");
        }
        System.out.println(l2);
    }
}
