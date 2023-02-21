package j10_MethodCreation.task;

import java.util.Scanner;

public class task08 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        leapYear();

    }

    public static void leapYear() {
        System.out.println("Bitte geben Sie ein Jahr ein : ");
        int leapYearCal = input.nextInt();
        System.out.println((leapYearCal % 4 == 0 && leapYearCal % 100 == 0 && leapYearCal % 400 == 0) ? "This is a leap year" : "This is a  not leap year");
    }
}
/*
    Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz

   input: 2023
   output:false
    */