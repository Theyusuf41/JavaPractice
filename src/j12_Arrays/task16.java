package j12_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task16 {
    public static void main(String[] args) {
        String arr [] = {"$12 $23 $10 $2 $5 $2"} ;
        Arrays.sort(arr);
        String str = Arrays.toString(arr);
        System.out.println(str.replaceAll("\\W", ""));
        int sum =0;

        for(int i=0; i<str.length(); i++) {

        }
    }
}
/*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
*/
