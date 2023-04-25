package Day01;

import java.util.*;

public class Q12_UniqueArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};
        List<Integer> l1 = new ArrayList<>();

        // 1. Yontem

        for (int i = 0; i < arr1.length ; i++) {
            if(!l1.contains(arr1[i])){
                l1.add(arr1[i]);
            }
        }
        System.out.println(l1 + " fori ile cozum");
        int [] arr2 = new int[l1.size()];
        for (int i = 0; i < l1.size(); i++) {
            arr2[i] = l1.get(i);
        }
        System.out.println(Arrays.toString(arr2));

        // 2. Yontem
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int i = 0; i < arr1.length; i++) {
            hm.put(arr1[i], i );
        }
        System.out.println(hm.keySet() + " Hashmap ile cozum");
    }




}
// Should every element from an Array  unique