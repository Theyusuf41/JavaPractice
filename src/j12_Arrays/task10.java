package j12_Arrays;

import java.util.Arrays;

public class task10 {
    public static void main(String[] args) {
        String str [] = {"Hello World"};
        Arrays.toString(str);


        for(int i= str.length;i>=0;i--){
            System.out.println(str[i]);
        }
    }
}
/*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
