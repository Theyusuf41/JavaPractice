package j34_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C10_LambdaObject {
    public static void main(String[] args) {

        University u01 = new University("Bogazici", "Matematik", 571, 73);
        University u02 = new University("Istanbul", "Matematik", 622, 77);
        University u03 = new University("Marmara", "Hukuk", 1453, 52);
        University u04 = new University("Itu", "uçak muh.", 333, 63);
        University u05 = new University("Yıldız Teknik", "Gemi ", 216, 55);

        List<University> unv = new ArrayList<>(Arrays.asList(u01,u02,u03,u04,u05));
        ortalamaUstu(unv);
        ogrenciSayisi(unv);
        matematikVarMi(unv);
        System.out.println(ogrSayisiBk(unv));
        System.out.println(notOrtIlkUc(unv));
        System.out.println(minOgrenciNum(unv));
        System.out.println(ortalamaUstuOgrenciSayisi(unv));
        ogrFazlaNotAl(unv);
        sayiMatBolumu(unv);
        belirliOgrenciNotAl(unv);
        belirliOgrenciNotAlDusuk(unv);



    }

    public static void belirliOgrenciNotAlDusuk(List<University> unv) {
        //task11-> Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu print eden code create ediniz...
        unv.stream()
                .filter(t -> t.getOgrcSayisi() < 1071)
                .sorted(Comparator.comparing(University::getNotOrt))
                .limit(1).forEach(t-> System.out.println(t));

        /*
        Bu kodlara bir alternatif bu:
        .stream()
                .filter(t -> t.getOgrcSayisi() < 1071)
                .mapToDouble(t -> t.getNotOrt())
                .min();//akışdaki elemanların min alındı
         */

    }

    public static void belirliOgrenciNotAl(List<University> unv) {
        //task10-> Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu print eden code create ediniz...
        unv.stream()
                .filter(t -> t.getOgrcSayisi() > 571)
                .sorted(Comparator.comparing(University::getNotOrt).reversed())
                .limit(1).forEach(t-> System.out.println(t));

    }

    public static void sayiMatBolumu(List<University> unv) {
        //task09-> "matematik" bolumlerinin sayisini  print eden code create ediniz...
        System.out.println(unv.stream()
                .filter(t -> t.getBolum().contains("Mat"))
                .count());

    }

    public static void ogrFazlaNotAl(List<University> unv) {
        //task08-> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini print eden code create ediniz...
        System.out.println(unv.stream()
                .filter(t -> t.getOgrcSayisi() > 333)
                .mapToDouble(t -> t.getNotOrt())
                .average());

    }

    public static int ortalamaUstuOgrenciSayisi(List<University> unv) {
        //task07-> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print eden code create ediniz...
        return unv.stream()
                .filter(t-> t.getNotOrt()>=63)
                .mapToInt(t->t.getOgrcSayisi())
                .sum();

    }

    public static List<University> minOgrenciNum(List<University> unv) {
        //task06-> ogrc sayisi en az olan 2. universite'yi  print eden code create ediniz...
        return unv.stream()
                .sorted(Comparator.comparing(University::getOgrcSayisi)).limit(2).skip(1)
                .collect(Collectors.toList());
    }

    public static List<University> notOrtIlkUc(List<University> unv) {
        //task05->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print eden code create ediniz..
       return unv.stream()
               .sorted(Comparator.comparing(University::getNotOrt).reversed())
               .collect(Collectors.toList());

    }

    public static List<University> ogrSayisiBk(List<University> unv) { // Muhtesem otesi bor code ornegi
        return unv
                .stream()
                .sorted(Comparator.comparing(University::getOgrcSayisi).reversed())//akışelamanları ogrcSayisina göre ters sıralandı
                .collect(Collectors.toList());//akışdaki elemanlar liste atandı
    }
        //task04->universite'leri ogr sayilarina gore b->k siralayiniz.
        //unv.stream().map(t-> t.getOgrcSayisi()).sorted(Comparator.reverseOrder()).forEach(t-> System.out.println(t));


    public static void matematikVarMi(List<University> unv) {
        //task03->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden code create ediniz.
        System.out.println(unv.stream().anyMatch(t -> t.getBolum().contains("Mat")) ? "En az birisinda matematik var" : "Maalesef hic matematik yok");

    }

    public static void ogrenciSayisi(List<University> unv) {
        //task02->ogrc sayilarinin   110 den az olmadigini  kontrol eden code create ediniz.
        System.out.println(unv.stream().noneMatch(t -> t.getOgrcSayisi() > 110) ? "110'dan az ogrenci var" : "110'dan daha fazla ogrenci var");
    }

    public static void ortalamaUstu(List<University> unv) {
        // Task01->Not ortalamasi 74 ustu olan'lari output veren code create ediniz
        System.out.println(unv.stream().anyMatch(t -> t.getNotOrt() > 74) ? "En az bir uni 74 ustu" : "Maalesef basari yerlerde");
    }


}
