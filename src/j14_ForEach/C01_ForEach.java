package j14_ForEach;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEach {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>(List.of(16,2,23,14,55,76));
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        for (Integer list: numbers ) {
            System.out.println(list + " FOr Each ");
        }


    }
}
