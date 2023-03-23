package j30_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C01_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>(Arrays.asList("yemek", "falan", "filan", "abc" , "qwe", "aqqweqw", "asda"));
        System.out.println(l1);
        l1.add("flln");
        System.out.println(l1 + " add sonrasi ");
        l1.add(1 , "amannn");
        System.out.println(l1 + " indexli add sonrasi ");
        l1.addFirst("düz ekmek");
        System.out.println(l1 + "  addFirst sonrasi ");


        LinkedList<String> l2 = new LinkedList<>(Arrays.asList("tatli", "matli", "filan", "abc" , "q11we", "aq22qweqw", "333asda"));
        l1.addAll(l2);
        System.out.println(l1 + " l1+ l2 sonucu");


    }

}
/*
LinkedList .....
1- LinkedList'de elemanlar "data" ve "adress" olmak uzere iki ksımdan oluşur ve eleman yerine "node" olarak tanımlanır.
2- LinkedList'te ilk node data barındırmayan sadece adres bulunduran head node tanımlanmıştır.
3- LinkedList'te son node adres kısmı null olan sadece data bulunduran tail node tanımlanmıştır.
4- ArrayList searching LinkedList node ekleme ve silmede daha avantıjlıdır.
5- LİnkedLİst -> tren vagon ilşikisi baglantısı gibi düşünülebilir
6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List, Queue ...) olmamasına dikkat edilmeli
    Ancak obj DataType olarak parent interface tanımlanabilir.
7- LinkedList class iki tane parent interface'den(List,Queue) implement etmiştir.
 */