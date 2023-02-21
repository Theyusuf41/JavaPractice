package whileLoop;

import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number1 : " );
        System.out.print("Please enter number2 : " );
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int toplam =0;
        int i =0;

        while (i<=((sayi1<sayi2) ? sayi1 : sayi2 )) {

            System.out.println(toplam);

        }
    }
}

// task-> istenilen kadar tamsayının toplamını print eden code create ediniz