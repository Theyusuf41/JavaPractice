package j32_Maps.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kisi {
    private String isim;
    private String soyisim;
    private String brans ;

    public Kisi(String isim, String soyisim, String brans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.brans = brans;
    }

    public String getIsim() {
        return isim;
    }
    public String getBrans() {
        return brans;
    }

    public static void main(String[] args) {

        String istenenDil="JAVA";
        List<String> isimList = new ArrayList<>(); // bos list olusturuldu
        Kisi k2 =new Kisi("Ali","can","java"); // Constructor ile obj olusturuldu
        HashMap<Integer,Kisi> map = new HashMap<>(); // Key Int , Value Kisi class olan bos Map
        if (k2.getBrans().equalsIgnoreCase(istenenDil)){ // varsa yoksa konrolu
            isimList.add(k2.getIsim()); // listeye eklendi
        }
        System.out.println(isimList);
    }
}
