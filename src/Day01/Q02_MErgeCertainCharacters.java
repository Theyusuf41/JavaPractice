package Day01;


import java.util.Scanner;

public class Q02_MErgeCertainCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein String ein : ");
        String str = input.nextLine();
        System.out.println("Bitte geben Sie eine Nummer ein : ");
        int number = input.nextInt();
        String firstLastCharacter = str.substring(0,1) + str.substring(str.length()-1);
        System.out.println(findFirstLastWithNumber(firstLastCharacter , number));
    }

    private static String findFirstLastWithNumber(String firstLastCharacter , int number) {
        String lastOutput= "";
        for (int i =0; i<number; i++) {
            lastOutput+=firstLastCharacter;
        }
        return lastOutput;
    }
}
/* Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
 * return eden metod yaziniz
 *
 * Örnek:  input            output
 *  1 -    elma  2           eaea
 *  2 -    army  3           ayayay
 */