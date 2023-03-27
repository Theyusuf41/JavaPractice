package j32_Maps.Task;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {

        HashMap<String , String> kartvizit = new HashMap<>();
        kartvizit.put("isim" , "Yusuf kara");
        kartvizit.put("email" , "karay@gmail.com");
        kartvizit.put("adres" , "straße 3");
        kartvizit.put("telefon" , "04987653");



        // Can alici bir kisim aslinda key value olayini her data da kullanarak esleyebiliriz.
        Map<Integer, HashMap<String , String>> kartvizit2 = new HashMap<>();
        kartvizit2.put(1, kartvizit);
        System.out.println(kartvizit2);

        Map<Integer , Task02_Kartvizit > kartvizitt = new HashMap<>();
        Task02_Kartvizit k1 = new Task02_Kartvizit("Yusuf" , "ysf@gmail.com" , "straße" , "4857213" );
        kartvizitt.put(k1.id, k1);
        System.out.println(kartvizitt);

        Task02_Kartvizit k2 = new Task02_Kartvizit("ali" , "ali@gmail.com" , "straße" , "4857213" );
        kartvizitt.put(k2.id, k2);
        System.out.println(k2);


    }
}
/*
Key -> isim, email, adres, telefon
Keylere ait valuelari depolayan bir kartvizit code'u create ediniz.
 */