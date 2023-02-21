package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C09_equals {
    public static void main(String[] args) {
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        ArrayList<String> ulkelist2 = new ArrayList<>(Arrays.asList("Alamanyaaa", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        System.out.println(ulkelist.equals(ulkelist2));

    }
}
// equals() iki listin hem index hem de value karsilastirmasini yapar!!