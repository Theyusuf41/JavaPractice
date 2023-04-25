package Day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Q11_Fibonacci {
    public static void main(String[] args) {
        var num = 6;

        int t = IntStream.rangeClosed(2,num).reduce(0, (x,y) -> (x+y));
        System.out.println(t); // denerken guzel bir cozum bir seye kadar toplam icin

        List<Integer> l1 = new ArrayList<>(Arrays.asList(0,1));
        int input = 10;
        for (int i = 2; i <input ; i++) {
            l1.add(l1.get(i-1)+ l1.get(i-2));
            // 0,1,1,2,3,5
        }
        System.out.println(l1);
 }
}
