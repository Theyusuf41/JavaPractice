package j06_SwitchStatement;
import java.util.Scanner;
public class task05 {
    public static void main(String[] args) {
        /*
		TASK :
		Girilen note değerinin  aşağıdaki kurallara göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Lütfen gecerli not giriniz" print ediniz

		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihr Note als Buschtaben ein : \n von 0 bis 50 :D \n von 50 bis 60 :C \n von 60 bis 80 :B \n von 80 bis 100 :A ");
        String note = input.nextLine();

        switch (note) {
            case "D":
                System.out.println("Ihr Note ist zwischen 0-50");
                break;
            case "C":
                System.out.println("Ihr Note ist zwischen 50-60");
                break;
            case "B":
                System.out.println("Ihr Note ist zwischen 60-80");
                break;
            case "A":
                System.out.println("Ihr Note ist zwischen 80-100");
                break;
            default:
                System.out.println("Falsch Buschtaben wurde eingegeben! ");
        }

    }

}
