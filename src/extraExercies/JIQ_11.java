package extraExercies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class JIQ_11 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5,101,50,999,77,301,501,40));
        /* 1. yontem
        Iterator itr = numbers.iterator();
        while(itr.hasNext()) {
            if((int)itr.next() > 100) {
                itr.remove();
            }
        }
        System.out.println(numbers);
         */

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)> 100) {
                numbers.remove(numbers.get(i));
            }
        }
        System.out.println(numbers);


    }
}
