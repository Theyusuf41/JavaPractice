package j05_ifStatementTernancyOperators.tasks;
import java.util.Scanner;
public class Task12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte schreiben Sie ein Input ein: ");
        char unknownInput = input.next().charAt(0);

        if (unknownInput>='a' && unknownInput<='z') {
            System.out.println("Das ist richtig");
        } else if (unknownInput<0 || unknownInput>0) {
            System.out.println("Das ist leider falsch");
        }
        /*

          TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..

         */


    }
}
