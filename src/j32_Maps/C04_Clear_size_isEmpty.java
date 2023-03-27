package j32_Maps;

import java.util.HashMap;

public class C04_Clear_size_isEmpty {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println(hm);


        System.out.println(hm.size() + " hm size");
        System.out.println(hm.isEmpty() + " hm isEmpty");
        hm.clear();
        System.out.println(hm + " hm clear");

    }
}
//map.size();->Girilen  map'in entry(giris: eleman) sayısını return eder.
//map.clear();->Girilen  map'in  tum entry(giris: eleman)siler .
//map.isEmpty();->Girilen  map'in entry(giris: eleman) varlığını kontrol eder boolean return eder.