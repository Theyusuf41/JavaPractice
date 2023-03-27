package j32_Maps;

import java.util.HashMap;

public class C09_replace {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println(hm + " replace oncesi");
        hm.replace("Amazon" , "99 Euro");
        System.out.println(hm + " replace sonrasi");
        System.out.println(hm.replace("Olmayan key", "olmayan value"));


    }
}
// map.replace() girilen value degeri ilgili keyde replace edilir.