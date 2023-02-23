package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class task17 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,6,1,7,3,5));

        withoutRepatList(list);

    }

    private static void withoutRepatList(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for(int i=0; i<list.size(); i++) {
            if(!uniqueList.contains(list.get(i))){
                uniqueList.add(list.get(i));
            }
        }
        System.out.println(uniqueList);


    }
}
// verilen listede tekrar eden sayilari sadece 1 kere print eden kod yaziniz!