package j06_SwitchStatement;
import java.util.Scanner;
public class task02 {
    public static void main(String[] args) {
        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız

        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie Tag der Woche :\n Montag = 1 \n Dienstag = 2 \n Mittwoch = 3 \n Donnerstag = 4 \n Freitag = 5 \n Samstag = 6 \n Sonntag = 7");
        int input1 = input.nextInt();
        int valueOfDayAfterHundredDay = ((input1 + 100) %7)%7;

        switch (valueOfDayAfterHundredDay) {
            case 1:
                System.out.println("Heute ist Montag");
                break;
            case 2:
                System.out.println("Heute ist Dienstag");
                break;
            case 3:
                System.out.println("Heute ist Mittwoch");
                break;
            case 4:
                System.out.println("Heute ist Donnerstag");
                break;
            case 5:
                System.out.println("Heute ist Freitag");
                break;
            case 6:
                System.out.println("Heute ist Samstag");
                break;
            case 7:
                System.out.println("Heute ist Sonntag");
                break;
            default:
                System.out.println("Leider wurde falsche Datein eingegeben!");
                break;
        }
    }
}
