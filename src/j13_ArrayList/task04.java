package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class task04 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Kasim", "Mehmet","Omer"));
        ArrayList<String> withoutAList = new ArrayList<>();

        for(int i=0; i<nameList.size(); i++) {
            if(!nameList.get(i).contains("A") && !nameList.get(i).contains("a") ) {
                withoutAList.add(nameList.get(i));
            }
        }
        System.out.println(withoutAList);

    }
}
// Input icinde "a" ve "A" olan elemanlari silen bir code create ediniz