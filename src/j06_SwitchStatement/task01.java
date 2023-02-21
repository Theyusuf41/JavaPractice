package j06_SwitchStatement;
import java.util.Scanner;
public class task01 {
    public static void main(String[] args) {
        //Task->  Girilen bir tamsayının onlar basamağının harf karakteri ile  print eden code create ediniz. //

        Scanner input = new Scanner(System.in);
        System.out.println("Bitte schreiben Sie eine Nummer ein: ");
        int numInput = input.nextInt();
        int convertedInput = (numInput / 10) %10;


        switch (convertedInput) {
            case 1:
                System.out.println("eins");
                break;
            case 2:
                System.out.println("zwei");
                break;
            case 3:
                System.out.println("frei");
                break;
            case 4:
                System.out.println("vier");
                break;
            case 5:
                System.out.println("fünf");
                break;
            case 6:
                System.out.println("sechs");
                break;
            case 7:
                System.out.println("sieben");
                break;
            case 8:
                System.out.println("acht");
                break;
            case 9:
                System.out.println("neun");
                break;
            default:
                System.out.println("Angegebene  Nummer ist leider ungültig");
        }
    }
}
