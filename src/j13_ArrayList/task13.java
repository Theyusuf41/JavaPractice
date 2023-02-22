package j13_ArrayList;

import java.util.ArrayList;

public class task13 {
    public static void main(String[] args) {
        int [] numbers = {-3,3,6,11,-15,15,21,-30};
        ArrayList<Integer> dividedToThree = new ArrayList<>();
        for(int i=0; i< numbers.length;i++) {
            if(numbers[i] %3 ==0) {
                dividedToThree.add(numbers[i]);
            }
        }
        System.out.println(dividedToThree);

    }
}
/* TASK :
        Girilen 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )

         */