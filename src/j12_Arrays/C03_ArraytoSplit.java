package j12_Arrays;

import java.util.Arrays;

public class C03_ArraytoSplit {
    public static void main(String[] args) {
        // string data, Array'a cevirmek icin kullanilir. Girilen parametre degere gore stringe parcalanir.

        String str = "javaCanlara selam olsun";
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));
        String arr1[] = str.split(" "); // bu sekilde kelimelere gore ayirilir.
        System.out.println(Arrays.toString(arr1));
    }
}
