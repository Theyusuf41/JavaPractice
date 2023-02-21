package j12_Arrays;

import java.util.Arrays;

public class task14 {
    public static void main(String[] args) {
        String str [] = {"Hello World"};
        String input = Arrays.toString(str);
        System.out.println(input.replaceAll("o", "K"));



    }
}
/*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */