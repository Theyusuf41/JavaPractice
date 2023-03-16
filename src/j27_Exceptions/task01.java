package j27_Exceptions;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password gir: ");
        String password = scanner.nextLine();

        try {
            if(password.length()<6 || password.length()>10) {
                throw new  IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Hata aldik ama solve ettik \nhata su: " + e.getMessage());
        }
        System.out.println("Kod finished");

    }


}
/*
Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını kontrol eden code create ediniz
 */