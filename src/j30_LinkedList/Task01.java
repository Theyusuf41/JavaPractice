package j30_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>(Arrays.asList("Murat", "javaCAN", "javaTAR", "Abdi bey"));
        Scanner scan = new Scanner(System.in);
        System.out.println("bir String değer giriniz : ");
        String str = scan.nextLine();
        if(l1.contains(str)){
            l1.remove("str");
            System.out.println("Agam eleman halledildi");
        }else {
            System.out.println("Agam elemana ulasilamadı");
        }

    }
}
/*
Task->
Node değerleri "Murat","javaCAN","javaTAR","Abdi bey" olan bir linkedList create ediniz.
Girilen bir String değeri linkedListte varlığını kontrol edip varsa slilp "Agam eleman halledildi"
yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi

 */