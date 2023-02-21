package j10_MethodCreation.task;

import java.util.Scanner;

public class task26 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        tekrarsızPrintEt();

    }

    private static void tekrarsızPrintEt() {

        System.out.print("bizim ooolan bişeyle gir bakennn : ");
        String str = input.nextLine();
        String tekrarsız = "";
        for (int i = 0; i < str.length(); i++) {
            if (!tekrarsız.contains("" + str.charAt(i))) {//tekrarsızda strnin döngüden gelen harfi yoksa şartı
                // if (!tekrarsız.contains(str.substring(i, i + 1))) {//tekrarsızda strnin döngüden gelen harfi yoksa şartı
                tekrarsız += "" + str.charAt(i);
            }
        }

        System.out.println(tekrarsız);
    }
}
// task-> Girilen bir ifadenin tekrarlı karakterleri yalnızca 1 kez print eden METHOD create ediniz
// input-> javacanlara selam olsun
// output-> javcnlr semou