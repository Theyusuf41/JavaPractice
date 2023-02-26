package j14_ForEach;

import java.util.ArrayList;

public class C03_forEachLoop {
    public static void main(String[] args) {
        String [] arr1 = {"nazim", "gülsüm", "dilek", "erol", "cüneyt", "cigdem"};
        String [] arr2 = {"mustafa", "gülsüm", "ayse", "enis", "cüneyt", "cigdem"};

        ArrayList<String> commonList = new ArrayList<>();
        for (String str1:arr1) {
            for (String str2:arr2) {
                if(str1.equalsIgnoreCase(str2)){
                    commonList.add(str1);
                }
            }
        }
        if(commonList.isEmpty()){
            System.out.println("There is no common element");
        }else System.out.println("Common" + commonList);

    }
}
// iki String array elemaninin ortak elemanlarini kontrol eden code create ediniz.