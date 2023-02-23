package j14_ForEach;

import java.util.ArrayList;
import java.util.List;

public class task01 {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>(List.of(16,2,23,14,55,76));
        for (Integer i: numbers.subList(3, numbers.size())) {
            if(i%2==1) {
                System.out.println(i);
            }

        }

    }
}
// Listin ilk 3 eleman haric tek sayilari print eden code create ediniz: