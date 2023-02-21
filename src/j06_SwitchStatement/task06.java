package j06_SwitchStatement;
import java.util.Scanner;
public class task06 {
    public static void main(String[] args) {
        //Task-> Girilen  VIP (Very Important Person) kisaltmasindaki harflerin anlamini print eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("VIP kelimesinin anlamini merak ediyor musunuz? ");
        char charInput = input.nextLine().toUpperCase().charAt(0);

        switch (charInput) {
            case 'V' :
                System.out.println("Very");
                break;
            case 'I' :
                System.out.println("Important");
                break;
            case 'P' :
                System.out.println("Person");
                break;
            default:
                System.out.println("Yanlis girdiniz!!");
        }
    }
}
