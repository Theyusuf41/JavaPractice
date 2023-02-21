package j08_loops;

import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();

        for(int i=1; i<=num; i++) {
            for(int it=1; it<=num; it++) {
                System.out.print(it * i);
            }
            System.out.println();
        }
    }
}
/*
        task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
          Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       5x5
         */