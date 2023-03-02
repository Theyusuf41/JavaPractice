package Day01;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String passcode = "yusufali41";
        for(int i=1; i<5; i++) {
            System.out.println("Bitte geben Sie Ihre Passcode: ");
            String str = input.nextLine();
            if(passcode.equals(str)){
                System.out.println("Das ist richtig! ");
                break;
            }else if(str!=passcode){
                System.out.println("Sie haben " + i + " mal versucht! ");
            }
        }

    }
}
// STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız. ( 4 kez deneme hakkı olsun )