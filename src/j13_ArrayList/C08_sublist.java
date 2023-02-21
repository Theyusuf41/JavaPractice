package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C08_sublist {
    public static void main(String[] args) {
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        System.out.println(ulkelist.subList(3, 5));

    }
}
// sublist() parcalar, boler. String Manipulation da oldugu gibi