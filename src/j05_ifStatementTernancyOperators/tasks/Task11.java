package j05_ifStatementTernancyOperators.tasks;
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie das Jahr ein:");
        int schaltJahr = input.nextInt();

        if (schaltJahr % 4 !=0){
            System.out.println("Das ist ein kein Schalterjahr");
        } else if (schaltJahr % 4 ==0 && schaltJahr % 100 !=0) {
            System.out.println("Das ist ein Schalterjahr");
        } else if (schaltJahr %400 !=0) {
            System.out.println("Das ist ein Schalterjahr");
        }
        /* Task->
           girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
            artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
         */
















    }
}
