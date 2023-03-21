package j29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C03_exercies {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("Harika" , "Eda" , "Ceren" , "Yusuf"));

        System.out.println("   ***   Task05   ***   ");
        Iterator it2 = l1.iterator();//step->1
        while (it2.hasNext()) {//step->2
            it2.next();//iteratordeki her bir eleman alındı
            it2.remove();//iteratordeki alınan  her bir eleman  silindi
        }
        System.out.println("l1 eleman silme sonrası " + l1); // []
    }
}
