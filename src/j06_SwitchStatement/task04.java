package j06_SwitchStatement;
import java.util.Scanner;
public class task04 {
    public static void main(String[] args) {
        /*
		Task-> Girilen ay ismine göre  ayin kac cektigini print eden code create ediniz.
		 */
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte schreiben Sie Name des eines Monats : ");
        String daysOfAMonth = input.nextLine();

        switch (daysOfAMonth) {
            case "January" :
                System.out.println("Dieser Monat hat 31 Tage");
                break;
            case "Februar" :
                System.out.println("Dieser Monat hat 28 || 29 Tage");
                break;
            case "März" :
                System.out.println("Dieser Monat hat 31 Tage");
                break;
            case "April" :
                System.out.println("Dieser Monat hat 30 Tage");
                break;
            case "Mai" :
                System.out.println("Dieser Monat hat 31 Tage");
                break;
            case "Juni" :
                System.out.println("Dieser Monat hat 30 Tage");
                break;
            case "Juli" :
                System.out.println("Dieser Monat hat 31 Tage");
                break;
            case "August" :
                System.out.println("Dieser Monat hat 30 Tage");
                break;
            case "September" :
                System.out.println("Dieser Monat hat 31 Tage");
                break;
            case "Oktober" :
                System.out.println("Dieser Monat hat 30 Tage");
                break;
            case "November" :
                System.out.println("Dieser Monat hat 31 Tage");
                break;
            case "Dezember" :
                System.out.println("Dieser Monat hat 30 Tage");
                break;
        }

    }
}
