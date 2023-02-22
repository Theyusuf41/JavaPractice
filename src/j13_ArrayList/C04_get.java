package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_get {
    public static void main(String[] args) {
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval

        System.out.println("ulkelist.get(3) = " + ulkelist.get(3));//Dingiltere
        // System.out.println("ulkelist.get(33) = " + ulkelist.get(33));//RTE IndexOutOfBoundsException. fırlatır

    }
}
// get() ile istenen elemanin indexi yazilir eger yoksa -1 return eder