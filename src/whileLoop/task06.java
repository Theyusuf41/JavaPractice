package whileLoop;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int it = 5;
        int i = 1;
        while(i<=100) {
            System.out.println("Please enter a random number which is between 0-100 : ");
            int num = input.nextInt();
            System.out.println((num == it) ? "Your guess is true" : "No, try again");
            i++;
        }
    }
}
 /*
        1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı kullanıcıya  tahmin ettirip tahmin sayısını print eden  code create ediniz.
         */