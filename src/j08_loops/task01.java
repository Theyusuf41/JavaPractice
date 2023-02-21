package j08_loops;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = input.nextInt();

        for(int i=1; i<=num; i++) {
            System.out.println((num % 3 == 0) ? "Java" : (num % 5 == 0) ? "CAN" : (num % 15 == 0) ? "Javacan" : "Invalid Input");
        }

        /*  Version of IF
        if(num%3==0){
                System.out.println("Java");
            }else if(num%5==0){
                System.out.println("CAN");
            }else
                System.out.println(num%15==0 ? "Javacan" : "Invalid Input");

         */

    }
}


/*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari
       		- Sayi 3’un kati ise sayi yerine “Java”
       		- Sayi 5’in kati ise sayi yerine “CAN'dır”
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz

*/