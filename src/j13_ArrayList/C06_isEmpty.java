package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C06_isEmpty {
    public static void main(String[] args) {
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        System.out.println(ulkelist.isEmpty());

        ulkelist.clear();

    }
}
// isEmpyt() list'in bos olup olmadigini kontrol eder.
// clear() ise list'in tum elemanlarini siler.