package j05_ifStatementTernancyOperators.tasks;
import java.util.Scanner;
public class Task09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Nummer ein: ");
        int numInput = input.nextInt();

        if(numInput<0){
            System.out.println("Angegebene Nummer ist negativ");
        } else if (numInput>0) {
            System.out.println("Angegebene Nummer ist pozitif");
        } else {
            System.out.println("Angegebene Nummer ist null");
        }
        /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */




    }
}
