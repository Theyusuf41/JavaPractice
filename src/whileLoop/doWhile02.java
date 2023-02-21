package whileLoop;

import java.util.Scanner;

public class doWhile02 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "javaTAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Agam bir metin giresen : ");
        String str ="";
        do {
            System.out.println("javaCAN");

            //System.out.print("Agam bir metin giresen : ");
            str=input.nextLine();



        }while (!str.equalsIgnoreCase("x"));//x girmediği sürece :x girene kadar şartı
        System.out.println("javaTAR");

    }
}
