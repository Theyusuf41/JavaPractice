package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C10_contains {
    public static void main(String[] args) {
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist.contains(\"Amerigonya\") = " + ulkelist.contains("Amerigonya"));//true
        System.out.println("ulkelist.contains(\"Angara\") = " + ulkelist.contains("Angara"));//false

    }
}
// contains()-> istenen elemanin varligini kontrol eder. True-false return eder.