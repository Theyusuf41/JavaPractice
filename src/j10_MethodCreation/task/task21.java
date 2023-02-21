package j10_MethodCreation.task;

import java.util.Scanner;

public class task21 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        digitCalc();


    }

    private static void digitCalc() {
        System.out.println("Bitte geben Sie eine Nummer ein : ");
        String nummer = input.nextLine();
        int count=0;
        for(int i=0; i<nummer.length(); i++) {
            count++;

        }
        System.out.print("Angegebene Nummer hat " + count + " Ziffer");

    }
}
  /*
    task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
    */