package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C07_set {
    public static void main(String[] args) {
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        System.out.println(ulkelist.set(3, "gambocya")); // eski elemanin ne oldugunu return eder!!
        System.out.println(ulkelist);

    }
}
// set veya update etmek -> listin istenen indexine istenen elemanini update(set) eder