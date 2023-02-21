package whileLoop;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name and surname : ");
        String nameSurname = input.nextLine();
        int i =0;

        while(i<=nameSurname.length()-1) {
            System.out.print(nameSurname.charAt(i) + " ");
            i++;
        }



    }
}
/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print den code create ediniz

		 */