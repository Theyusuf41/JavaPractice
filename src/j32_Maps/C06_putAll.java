package j32_Maps;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println(hm);


        HashMap<String, String> hm1 = new HashMap<>();//bos hm tanımlandı
        hm.put("cicek", "296 Euro");
        hm.put("bocek", "200 Euro");
        hm.put("kedi", "111 Euro");
        hm.put("kopek", "450 Euro");
        hm.put("at", "333 Euro");
        hm.put("esekk", "444 Euro");
        System.out.println(hm1);

        hm.putAll(hm1);
        System.out.println(hm);


    }
}
// map.putAll() Girilen map istenen map'e eklenir.