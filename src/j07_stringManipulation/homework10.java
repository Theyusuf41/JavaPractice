package j07_stringManipulation;

import java.util.Scanner;

public class homework10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write a name");
        String str = input.nextLine();


        String result = (str.length() <= 3 && str.charAt(0) != str.charAt(1) && (str.charAt(0) != str.charAt(2)) && (str.charAt(1) != str.charAt(2)) ? "Harfler unique" : "Harfler unique degil");
        System.out.println(result);

    }
}
/* TASK :
 * Girilen  isim sadece 3 harfli olmalidir ternary
 * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
 *
 *         char first = name.charAt(0);
        char second = name.charAt(1);
        char third = name.charAt(2);
 */