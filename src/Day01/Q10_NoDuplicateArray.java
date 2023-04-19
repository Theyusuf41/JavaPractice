package Day01;

import java.util.*;
import java.util.stream.Collectors;

public class Q10_NoDuplicateArray {
    public static void main(String[] args) {
        int [] arr1 = {1,1,1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10));
        int [] arr2 = {};
        for (int x: arr1  ) {
            if(!l1.contains(x)){
                l1.add(x);
            }
        }
        System.out.println(l1 +" duz cozum");  // 1. yol

        HashSet<Integer> hs1 = new HashSet<>(); // HashSet dogasi geregi duplication'a izin vermez. Ancak print Hash code'a gore olur.
        for (int i = 0; i < arr1.length ; i++) {
            /*if(!hs1.contains(arr1[i])){
                hs1.add(arr1[i]);
            }*/
            hs1.add(arr1[i]);
        }
        System.out.println(hs1 + " HashSet ile cozum");  // 2.yol



        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();  // LinkedHashSet dogasi geregi tekrara dusmez. Dipnot : eklendigi siraya gore print eder
        for (int x: arr1 ) {
            lhs.add(x);
        }
        System.out.println(lhs + " LinkedHashSet ile cozum"); // 3.yol

        //arrayStream(arr1,lhs);
        getToWrite(arr1);


        //List<Integer> l1 = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10));
        l1.stream().filter(t-> t%2==0).forEach(t-> System.out.println(t + " lambda ile 2'ye bolunme "));

    }

    private static void getToWrite(int[] arr1) {
        System.out.println(Arrays.toString(arr1));
    }


}
// Task -> verilen Arraydeki tekrar eden sayilarin, ilki haric silip arraye atin! duplicate
// Input    -> {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
// Output   -> {1,2,3,4,-2,5,6,8,7,9,10}