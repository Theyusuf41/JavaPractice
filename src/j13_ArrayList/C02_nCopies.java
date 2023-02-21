package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {

        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        ArrayList<String> isimList = new ArrayList<>(List.of("Aydın", "Cihat", "Ismail", "Ceren", "Furkan", "Tugba"));//çuval

        ArrayList<String> yeniList = new ArrayList<>(Collections.nCopies(7,"javaTAR"));//-> 7 javaTAr elemanlı lst tanımlandı

}
//nCopies(int n, Obj)-> n elemanlı sabit obj'den oluşan list tanımlar
