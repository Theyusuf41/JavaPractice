package j07_stringManipulation;

import java.util.Scanner;

public class homework12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("3 Kelimelik isim giriniz");
        String name = input.nextLine();
        int firstspace = (name.indexOf(" "));
        int lastspace = (name.lastIndexOf(" "));
        System.out.print(name + " -> " + name.charAt(0) + "." + (name.charAt(firstspace + 1) + "." + (name.charAt(lastspace + 1) + ".")));

    }
}
/*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */