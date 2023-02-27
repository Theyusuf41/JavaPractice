package j15_Varargs;

import java.util.ArrayList;

public class C03_task01 {
    public static void main(String[] args) {
        concatStrings("h", "a", "l", "u", "k");

    }

    private static void concatStrings(String...str) {
        String concatedString= "";
        for (String x: str) {
            concatedString+=x;
        }
        System.out.println(concatedString);
    }
}
// task01-> Verilen Stringleri birlestiren concat isimli method create ediniz.
