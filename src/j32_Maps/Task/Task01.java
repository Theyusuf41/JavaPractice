package j32_Maps.Task;

import java.util.HashMap;

public class Task01 {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Amazon" , 296);
        map.put("Ebay" , 301);
        map.put("Saturn" , 326);
        map.put("Mediamarkt" , 340);
        map.put("Apple Store" , 320);
        int sum = 0;

        for (int x: map.values()) {
            sum+=x;
        }
        System.out.println(sum);

    }
}
// Task -> urun fiyatlarini hesaplayan code create ediniz.