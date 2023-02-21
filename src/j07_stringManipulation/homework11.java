package j07_stringManipulation;

import java.util.Scanner;

public class homework11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ad soyad giriniz");
        String str = input.nextLine();

        int space = str.lastIndexOf(" ");
        String name =str.substring(0,space);
        String surname =str.substring(space).trim().toUpperCase();
        System.out.println(name.concat(" \n" + surname));
    }
}
/* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı prnt eden code create ediniz
       */