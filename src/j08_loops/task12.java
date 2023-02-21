package j08_loops;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sum=0;

            for(int i=1; i<=5; i++) {
                System.out.println("Please enter 5 different numbers:");
                int num = input.nextInt();
                if(num<=10 || num>=20) {
                    sum+=num;
                }
            }
            System.out.println("The end point or result of these calculation is :" +  sum);
        }


    }
// girilen 5 sayinin 10 ile 20 arasi haric toplamini print eden kod create ediniz: //