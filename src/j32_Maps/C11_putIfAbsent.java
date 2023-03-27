package j32_Maps;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println(hm.putIfAbsent("Amazon", "selametle"));
        System.out.println(hm.putIfAbsent("yok", "ne gelcek acep"));

    }
}
// map.putIfAbsent  Girilen key maptre yok ise entry mape eklenir ve null return eder
// Girilen key mapte var ise keye ait value return eder