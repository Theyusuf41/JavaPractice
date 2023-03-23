package j30_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>(Arrays.asList("yemek", "falan", "filan", "abc" , "qwe", "aqqweqw", "asda"));
        l1.remove("yemek");
        System.out.println("yemek cikmis hali " +l1);


        LinkedList<String> l2 = new LinkedList<>(Arrays.asList("tatli", "matli", "filan", "abc" , "q11we", "aq22qweqw", "333asda"));
        l1.addAll(l2);
        System.out.println(l1 + " l1 + l2 ");

    }
}
