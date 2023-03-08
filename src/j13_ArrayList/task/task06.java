package j13_ArrayList.task;

import java.util.ArrayList;
import java.util.Arrays;

public class task06 {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(5,4,6,2,1));
        hillNum(numbersList);

    }

    private static void hillNum(ArrayList<Integer> numbersList) {

    }
}
/*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */