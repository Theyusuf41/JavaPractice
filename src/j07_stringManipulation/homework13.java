package j07_stringManipulation;

import java.util.Scanner;

public class homework13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir string ifade giriniz");
        String str = input.nextLine();
        int value = str.replaceAll(" ","").length();
        System.out.println(value);

    }
}
//Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.