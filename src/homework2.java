import java.util.Scanner;
import java.lang.Math;

public class homework2 {
    public static void main(String[] args) {
        /*double num;
        Scanner input = new Scanner(System.in);
        System.out.println("Double sayi giriniz: ");

        num = input.nextDouble();
        double num1 = (int) Math.pow(num,2);
        System.out.println(num1); */

        // Task 2 //
        double dNum = 3.3;
        double dNumsqrt = Math.sqrt(dNum);
        System.out.println(dNumsqrt);

        // Task 3 //
        int nums = Math.max(5,6);
        System.out.println(nums);

        // Task 4 //
        int calculation = Math.abs(5-6);
        System.out.println(calculation);

        // Task 5 //
        int nums2 = Math.min(5,2);
        System.out.println(nums2);

        // Task 6 //
        double randomNum = Math.random();
        System.out.println(randomNum);

        // Task 7 //
        int randomNum2 = (int)(Math.random()*9+1);
        System.out.println(randomNum2);

        // Task 8 //
        int randomNum3 = (int)(Math.random()*100);
        System.out.println(randomNum3);

        // Task 9 //
        int calculationOfSquare = 16;
        int singleLineOfSquare = (int)  (Math.sqrt(calculationOfSquare));
        int finalCalc = singleLineOfSquare * 4;
        System.out.println(finalCalc);

        // Task 10 //
        int numm1 = 3;
        int numm2 = 5;
        if (numm1<numm2){
            System.out.println(numm1);
        }

        // Task 11 //
        int randomNum4 = (int) (Math.random()*20-10);
        System.out.println(randomNum4);

        // Task 12 //
        double pi = Math.PI;
        System.out.printf("%5.2f%n");

        // Task 13 //
        int day = 12;
        int month = 01;
        int year = 2023;
        System.out.printf("%2d/%2d/%4d",day,month,year);

        // Task 14 //
        




    }
}
