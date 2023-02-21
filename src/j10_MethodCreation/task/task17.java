package j10_MethodCreation.task;

import java.util.Scanner;

public class task17 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        reverseNumbers();

    }

    private static void reverseNumbers() {
        System.out.println("Bitte geben Sie Nummer ein: ");
        String num = input.nextLine();
        for(int i=num.length()-1; i>=0; i--){
            System.out.print(num.charAt(i));
        }

    }
}
 /*
            Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
            input:1453
            output:3541

         */