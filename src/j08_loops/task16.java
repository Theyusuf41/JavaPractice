package j08_loops;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number and System will check if these number is prime");
        int num = input.nextInt();
        int count = 0;

        for(int i=2; i<num; i++ ) {
            if(num%i ==0) {
                count++;
            }
        }
        System.out.println((count == 0) ? "Prime number" : "Not a prime number");
    }
}
// Task: Girilen sayinin asal olma durumunu kontrol ediniz:
//Scanner input = new Scanner(System.in);
//        System.out.println("agam bir sayi giresen : ");
//
//        int sayi = input.nextInt();
//        int bolenSayisi = 0;//boş bir int kutu tanımlandı
//
//        for (int i = 2; i < sayi; i++) {
//
//            if (sayi % i == 0) {
//                bolenSayisi++;
//            }
//        }
//
//        if (bolenSayisi == 0) {
//            System.out.println("girirlen sayi ASALdır");
//        } else System.out.println("girlen sayı ASAL DEĞİL ");