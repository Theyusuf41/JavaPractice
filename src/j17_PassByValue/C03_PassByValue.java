package j17_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_PassByValue {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(24,20,87));
        System.out.println(numberList);
        listUpdate1(numberList);
        listUpdate2(numberList);
        System.out.println(numberList);

    }

    private static void listUpdate2(ArrayList<Integer> numberList) {
        for (int i = 0; i < numberList.size(); i++) {
            numberList.set(i, numberList.get(i) - 7);
        }
        System.out.println(numberList);

    }

    private static void listUpdate1(ArrayList<Integer> numberList) {
        for (Integer x: numberList) {
            x+=5;
        }
        System.out.println(numberList);
    }
}
/*
java non-primitive(Class array list-> refrans ) data turlerinde obj kemdisi değil de dataları geğişirse
obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
 */
// Task -> list elemanları 24,20,87 iki farklı method ile list elemanlarını
//      update dip print code create ediniz.
//1. method-> with for each 2. method-> set(index,value)