package whileLoop;

import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your passcode : " );
        String passcode = input.nextLine();
        int i=0;


        while(i<1) {
            System.out.println((!passcode.contains(" ") && Character.isLowerCase(passcode.charAt(0)) && !Character.isDigit(passcode.charAt(passcode.length() - 1)) && passcode.length() >= 10) ? "Passcode is saved" : "False input");
            i++;
        }
    }
}
// passcode.contains(" ")
// Character.isDigit(passcode.length()-1)
// !Character.isLowerCase(passcode.charAt(0))
// task-> girilen şifrenin asagidaki sartlari kontrol edin
// ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
// eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
// - ilk harf kucuk harf olmali +
// - son karakter rakam olmali +
// - sifre bosluk icermemeli
// - uzunlugu en az 10 karakter olmali +