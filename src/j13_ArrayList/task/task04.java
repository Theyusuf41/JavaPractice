package j13_ArrayList.task;

import java.util.ArrayList;
import java.util.Arrays;

public class task04 {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));
        String str1 = "blue";
        String str2 = "yellow";

        changeInArraylist(lists, str1, str2);

    }

    private static void changeInArraylist(ArrayList<String> lists, String str1, String str2) {
        for(int i=0; i< lists.size(); i++) {
            if(str1.equals(lists.get(i))) {
                lists.set(i , str2);
            }
        }
        System.out.println("Yeni liste su sekilde : " + lists);
    }
}
/*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */