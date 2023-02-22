package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class task05 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers + " reverse ArrayList ");


    }
}
// Task-> girilen int değeri tersten print eden code create ediniz.