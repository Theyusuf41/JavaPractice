package Day01;

import java.util.Scanner;

public class Q03_PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine  Nummer ein : ");
        int sayi = input.nextInt();
        boolean asalmi=true;
        if (sayi>=2) {
            for (int i = 2; i <sayi ; i++) { // sayi/2+1
                if (sayi%i==0) {
                    asalmi=false;break;
                }
            }
            if (asalmi) System.out.println("Sayı asaldır");
            else System.out.println("Sayi asal değildir");
        } else System.out.println("Sayi asal değildir");


    }

}
/*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */