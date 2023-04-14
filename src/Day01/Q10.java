package Day01;

import java.util.*;
import java.util.stream.Collectors;

public class Q10 {
    public static void main(String[] args) {
        int [] arr1 = {1,1,1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};
        List<Integer> l1 = new ArrayList<>();
        int [] arr2 = {};
        for (int x: arr1  ) {
            if(!l1.contains(x)){
                l1.add(x);
            }
        }
        System.out.println(l1 +" duz cozum");  // 1. yol

        HashSet<Integer> hs1 = new HashSet<>(); // HashSet dogasi geregi duplication'a izin vermez. Ancak print Hash code'a gore olur.
        for (int i = 0; i < arr1.length ; i++) {
            if(!hs1.contains(arr1[i])){
                hs1.add(arr1[i]);
            }
        }
        System.out.println(hs1 + " HashSet ile cozum");  // 2.yol



        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();  // LinkedHashSet dogasi geregi tekrara dusmez. Dipnot : eklendigi siraya gore print eder
        for (int x: arr1 ) {
            lhs.add(x);
        }
        System.out.println(lhs + " LinkedHashSet ile cozum");


    }
}
// Task -> verilen Arraydeki tekrar eden sayilarin, ilki haric silip arraye atin!
// Input    -> {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
// Output   -> {1,2,3,4,-2,5,6,8,7,9,10}