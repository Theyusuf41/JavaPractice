package j08_loops;


import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = input.nextInt();

        for(int i=1; i<=num; i++) {
            for(int it=1; it<=i; it++) {
                System.out.print("*");
            }
            System.out.println(""); // dumy
        }

    }
}
/*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *

         */