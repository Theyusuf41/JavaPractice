package j07_stringManipulation;
import java.util.Scanner;
public class stringManipulation {
    public static void main(String[] args) {
        String input1 = "yusuf karaoglu";
        System.out.println("Bu String'in uzunlugu " + input1.length());
        System.out.printf(input1.toUpperCase());
        System.out.printf(input1.toLowerCase());


        System.out.println("bosluk \n bosluk");

        String str = "Yusuf";
        String str1 = "kara";
        System.out.printf(str.concat(str1.toUpperCase()));

        System.out.println("methodlar arasi bosluk \n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a password : ");
        String newScan = scan.nextLine();
        System.out.printf("Your password is strong", newScan.contains("abc"));

        System.out.println("Contains kismi gecildi \n ");

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Sondan onuncu harflerin ciktisini aliniz: ");
        String newScan1 = scan1.nextLine();
        System.out.printf(newScan1.substring(newScan1.length() - 10));



    }
}
