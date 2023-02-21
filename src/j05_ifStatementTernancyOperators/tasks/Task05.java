package j05_ifStatementTernancyOperators.tasks;
import java.util.Scanner;
public class Task05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Nummer ein");
        int numInput = input.nextInt();

        if(numInput>=10 && numInput<100 ){
            System.out.println("angegebene Nummer hat " + numInput + " 2 Ziffer");
        }else if(numInput>=100 && numInput<999) {
            System.out.println("angegebene Nummer hat " + numInput + " 3 Ziffer");
        }else if(numInput<10 || numInput>=1000) {
            System.out.println("angegebene Nummer ist " + numInput + " ungültig");
        }
		/* Task->
		 Girilen bir sayı için
		 sayi 3 basamakli ise console ' a "3 basamakli"
		 sayi 2 basamakli ise console'a "2 basamakli"
		 sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
		 */

    }
}
