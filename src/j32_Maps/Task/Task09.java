package j32_Maps.Task;

import java.util.HashMap;
import java.util.Map;

public class Task09 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Erik", 150);
        hm.put("Keciboynuzu", 750);
        hm.put("Nar", 250);
        hm.put("Uzum", 950);

        for (Map.Entry<String , Integer> each: hm.entrySet()) {
            System.out.println(each.getKey() + " " + each.getValue());
        }

    }
}
// key ve value degerlerini asagidaki sekilde print eden code create ediniz
// Incir 200
// Nar 500