package j10_MethodCreation.task;

import java.util.Scanner;

public class taskkk02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name : ");
        String name = input.nextLine();

        System.out.println("Surname : ");
        String surname = input.nextLine();

        makeBigLetters(name, surname);
        System.out.println(makeBigLetters2(name, surname));

    }

    public static void makeBigLetters(String name, String surname) {
        System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
        System.out.println((surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase()));

    }


    public static String makeBigLetters2(String name, String surname) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + (surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase());

    }
}
// task : girilen ad soyadin ilk harflerini buyuk digerlerini kucuk  print eden method create ediniz://