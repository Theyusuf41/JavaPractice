package whileLoop;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, count=0;

        while(sum<=333) {
            System.out.println("Please enter a number");
            sum+=input.nextInt();
            count++;
        }
        System.out.print("sum of numbers: " + sum + "the count of the numbers: " + count );

    }
}
// task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create ediniz