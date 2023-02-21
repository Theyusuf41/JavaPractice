package j08_loops;

import java.util.Scanner;

public class exercies01 {
    public static void main(String[] args) {
        String masallah = "masallah";

        /*for(int i=1; i<=41; i++) {
            System.out.println(masallah + i);
        } */

        // 2 basamakli tek sayilari ayni satira print eden kod create ediniz: //

        /*for(int i=9; i<100; i+=2 ) {
            System.out.print(i + "tek sayilar ");
        } */

        // Girilen sayidan 100"e kadar olan 4"un kati tamsayilari print eden code create ediniz: //+
        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positiv number : ");
        int num = input.nextInt();

        if (num > 100) {
            System.out.println("Wrongggg");
        } else {
            for (int i = num; i < 100; i++) {
                if (i % 4 == 0) {
                    System.out.println(i);
                }
            }


        } */






        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = input.nextInt();

        if(num1<num2 && num1>0 && num2>0) {
            for(int i=num1; i<num2; i++) {
                System.out.print(i);
            }
        }else if (num2<num1 && num1>0 && num2>0) {
            for(int i=num2; i<num1; i++ ) {
                System.out.print(i);
            }

        }  */


        // for(int i=(num1<num2 ? num1: num2);  i<=(num1>num2 ? num1 : num2); i++)
        // System.out.println(i%2==0 ? i+"" : "");     Muhtesem bir code ornegi



        // Task: sekilli sukullu seyleri nested for ile cikti olarak al //
        /*for(int i =1; i<=6; i++) {
            for(int it =1; it<=5; it++) {
                System.out.print("#");
            }
            System.out.println();
        } */


        // Task: 10a kadar olan carpim tablosunu create ediniz: //

        /*for(int i=1; i<=10 ; i++) {
            for(int it=1; it<=10; it++) {
                System.out.println(i + "x" + it);
            }
            System.out.println();
        } */


        // Task: girilen boyutta kare carpim tablosu ciktisi aliniz: //

        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();

        for(int i=num; i<=num; i++) {
            for(int it=num*2; it<=num*5; it++) {
                System.out.print(it + i);
            }
            System.out.println();
        } */

        // Task : Girilen sayinin faktoriyelini aliniz: //
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int num = input.nextInt();
        for(int i=1; i<=num; i++) {
            System.out.println(i * num);
        }


    }



}
