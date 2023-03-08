package j13_ArrayList.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>(Arrays.asList("Orange" , "Kiwi" , "Peach" , "Banana" , "Orange"));
        String item = "Orange";
        System.out.println(getCount(items, item));

    }

    private static int getCount(ArrayList<String> items, String item) {
        int counter=0;
        for(int i=0; i< items.size(); i++) {
            if(item.equals(items.get(i))){
                counter++;
            }
        }
        return counter;
    }

}
/*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String alın

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */