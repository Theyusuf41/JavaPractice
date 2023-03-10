package j13_ArrayList.task;

import java.util.ArrayList;

public class task12 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,1};
        int [] arr2 = {1,2,3,4};
        System.out.println(duplicate(arr1));

    }

    private static boolean duplicate(int[] arr1) {
        boolean trueOrFalse= false;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length ; i++) {
            list.add(arr1[i]);
            if(list.contains(arr1[i])){
                trueOrFalse= true;
            }
        }
        return trueOrFalse;
    }
}
/*
    duplicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.

    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */