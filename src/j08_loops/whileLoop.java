package j08_loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        /*int x = 3;
        int sum =0;
        while(x<=20) {
            System.out.println(x + "");
            x++;
        } */
        /*int x= 0;
        while(x<=7) {
            System.out.println("Javacan");
            x++;
        } */

        // 100 e kadar olan tek sayilari print ediniz: //
        /*int i = 10;
        while(i<100) {
            if(i%2 !=0) {
                System.out.println(i);
            }
            i++;
        } */


        // tek basamakli sayilari print eden kodu print ediniz: //
        /*int x = 1;
        while(x<10) {
            System.out.print(x + " ");
            x++;
        } */



        //  girilen ifadeyi tersten print ediniz: //
        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string :");
        String str = input.nextLine();
        int str2 = str.length();

        while(str.length()>=1) {
            System.out.println(str.charAt(str2-1));
            str2--;
        }*/



        // girilen tamsayiya kadar sayilarin toplamini print //
        Scanner input = new Scanner(System.in);
        /*System.out.println("Please enter a number :");
        int i = input.nextInt();
        int sum = 0;

        while(i>=0) {
            sum+=i;
            i--;
        }
        System.out.println(sum); */



        // girilen sayinin faktoriyelini bulunuz: //
        /*System.out.println("Bir sayi gir ulan ");
        int i = input.nextInt();
        int fak = 1 ;

        while(i>0) {
            fak*=i--;
        }
        System.out.println(fak); */


        // girilen tam sayinin rakamlarini print
        /*System.out.println("Sayi gir lutfen");
        int num = input.nextInt();
        int sum = 0;

        while(num>0) {
            sum+=num%10;
            num/=10;  // num = num/10

        }
        System.out.println(sum); */


        // girilen sayinin pozitif bolenlerini print ediniz: //
        /*System.out.println("Sayi giriniz: ");
        int num = input.nextInt();
        int bolenSayi = 1;
        int tamBolen = 0;

        while (bolenSayi <= num) {

            if (num % bolenSayi == 0) {
                tamBolen++;
            }
            bolenSayi++;
        }
        System.out.println("tamBolen = " + tamBolen); */

        


        //

    }
}
