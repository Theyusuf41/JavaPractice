package j32_Maps;

import java.util.HashMap;

public class C07_containsKey_containsValue {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println("hm.containsKey(\"Amazon\") = " + hm.containsKey("Amazon")); // true

        System.out.println("hm.containsKey(\"amazon\") = " + hm.containsKey("amazon")); // false

        System.out.println("hm.containsValue( \"296 Euro\") = " + hm.containsValue("296 Euro")); // true

        System.out.println("hm.containsValue(\"olmayan value\") = " + hm.containsValue("olmayan value")); // false

    }
}
