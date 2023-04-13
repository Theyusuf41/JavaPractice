package Day01;

import java.util.Scanner;

public class Q03_PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine  Nummer ein : ");
        int sayi = input.nextInt();
        boolean asalMi=false; //
        for (int i = 2; i < sayi; i++) {
            if(sayi%i==0){
                asalMi= true;
                break;
            }
        }
        if (!asalMi) System.out.println(sayi+ " asal sayi");
        else System.out.println(sayi+ " asal sayi degil");


        isPrime(sayi);
    }

    private static void isPrime(int sayi) {
        var i = 2;
        var flag= false; // asal sayi degilse
        while(i<=sayi/2){
            if(sayi%i==0){
                flag=true;
                break;
            }
            i++;
        }
        if(!flag) System.out.println(sayi+ " asal sayi");
        else System.out.println(sayi+ " asal sayi degil");

    }


}
/*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
*/