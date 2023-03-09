package j13_ArrayList.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task08 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(5,3,4,6,7,10,50));
        secondMax(numberList);


    }

    public static void secondMax(ArrayList<Integer> numberList) {
        Collections.sort(numberList);
        for (int i = 0; i < numberList.size() ; i++) {
            if(numberList.get(i) == numberList.size()-2){
                System.out.println(numberList.get(numberList.size()-2));

            }
        }

    }
}
 /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */