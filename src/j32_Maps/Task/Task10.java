package j32_Maps.Task;

import java.util.HashMap;

public class Task10 {
    public static void main(String[] args) {
        String [] arr1 = {"javaCAN" , "javaNur", "javaSu"};
        String [] arr2 = {"yusuf" , "ali", "ekmelettin"};
        HashMap<String , String> hm = new HashMap<>();
        for (int i = 0; i < arr1.length ; i++) {
            hm.put(arr1[i], arr2[i]);
        }
        System.out.println(hm);

    }
}
// ad ve soyad iki arrayde bulunuyor bunlari bir map'e atip print ediniz.
// Ad key ; soyad value olacak iste