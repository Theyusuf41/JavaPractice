package j08_loops;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter a value for the square");

        int measure = input.nextInt();

        for (int i = 1; i <= measure; i++) {
            for (int it = 1; it <= measure; it++) {
                System.out.print((i == it) ? "1  " : "0  ");
            }
            System.out.println();

        }
    }
}
/*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */