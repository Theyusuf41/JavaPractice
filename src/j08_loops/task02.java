package j08_loops;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = input.nextLine();
        String emptyStr = "";
        char ch;

        for(int i=0; i<name.length(); i++){
            ch = name.charAt(i);
            emptyStr = ch+emptyStr;
            System.out.println((name.equals(emptyStr) ? "Palindrom bir ifadedir" : "Palindrom bir ifade degildir."));

        }


    }
}
/* task-> interview question
        girilen ifadenin palindrome olmasını kontrol eden code create ediniz...
        palindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */