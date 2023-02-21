package j07_stringManipulation;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a password : \n a-First character must be uppercase : \n b-Last character must be a number : \n c-At least 6 character :");
        String password = input.nextLine();


        if(Character.isUpperCase(password.charAt(0))) {
            System.out.println("First condition is true !");
        } else if (Character.isDigit(password.length()-1)) {
            System.out.println("Second condition is true");
        } else if (password.length()>=6) {
            System.out.println("Third condition is true");
        } else
            System.out.println("False or invalid input");


    }
}

 /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */
