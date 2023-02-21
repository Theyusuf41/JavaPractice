package j07_stringManipulation;

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String name = input.next();
        System.out.println("Soy adinizi giriniz");
        String surname = input.next();

        System.out.println((name.substring(0, 1).toUpperCase() + name.substring(1))+" "+(surname.substring(0, 1).toUpperCase() + surname.substring(1)));


    }
}
/* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
         */