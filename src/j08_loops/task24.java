package j08_loops;

import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str = input.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {// strnin son karakterinden 0. karaktere bir tekrar tanımlandı
            System.out.print(str.charAt(i));
        }
        System.out.println("   ***   ");

        for (int i = 0; i <= str.length() - 1; i++) {// strnin son karakterinden 0. karaktere bir tekrar tanımlandı
            System.out.print(str.charAt(str.length() - 1 - i));
        }
    }
}
// Stringi reverse edip yazdir //