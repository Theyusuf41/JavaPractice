package whileLoop;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number : " );
        int num = input.nextInt();
        int i = 1;


        while(i<=num) {
            System.out.println( i);
            i+=2;
        }




    }
}
// task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.