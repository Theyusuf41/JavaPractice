package j34_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(58,7,54,41,59,33,38,13,65,61,46,45,25,16));
        lambda(l1);
        System.out.println("\n task02");
        ciftotusBes(l1);
        System.out.println("\n task03");
        tekVeBuyuk(l1);



    }

    private static void lambda(List<Integer> l1) {
        l1.stream().forEach(C02_Filter::dividedByThree);
    }
    public static void dividedByThree(int a) {
        System.out.print((a % 2 == 0) ? " " + a : "");
    }


    public static boolean ciftMi (int a) {
        return a%2==0;
    }
    // task01 -> list elemanlarindan cift olanlarini ayni satirda bosluk olarak crreate ediniz-


    // task02 -> list elemanlarindan cift olanlarini ve 35 kucuk olanlari ayni satirda bosluk olarak crreate ediniz.
    public static void ciftotusBes(List<Integer> l1){
        l1.stream()
                .filter(C02_Filter::ciftMi).filter(t -> t<35)
                .forEach(C01_LambdaExpression::printOut);
    }

    // task03 -> list elemanlarindan tek olanlarini veya 34 buyuk olanlari ayni satirda bosluk olarak crreate ediniz.
    public static void tekVeBuyuk(List<Integer> l1) {
        l1.stream()
                .filter(t -> (t>34) ||  t%2==1)
                .forEach(C01_LambdaExpression::printOut);
    }



}
