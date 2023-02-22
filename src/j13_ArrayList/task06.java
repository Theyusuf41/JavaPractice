package j13_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class task06 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(1);
        numbers.add(9);
        numbers.add(15);
        numbers.add(6);
        numbers.add(2);
        numbers.add(1);
        System.out.println(numbers + " unsorted ArrayList");
        Collections.sort(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers + " max to min ArrayList ");


    }
}
// Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz