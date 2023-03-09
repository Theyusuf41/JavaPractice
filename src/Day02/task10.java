package Day02;

import java.util.ArrayList;
import java.util.Arrays;

public class task10 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList( 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28));
        int min=20;
        int max=30;

        System.out.println(rangeBtw(list1, min, max));

    }

    private static int rangeBtw(ArrayList<Integer> list1, int min, int max) {
        int counter=0;
        for (int i = 0; i < list1.size() ; i++) {
            if(list1.get(i)>=min &&  list1.get(i)<=max){
                counter++;
            }
        }
        return counter;
    }
}
/*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */