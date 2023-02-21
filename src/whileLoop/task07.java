package whileLoop;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int big = 0, count = 1;

        while (count <= 7) {
            System.out.print(count+". enter a number :");
            int num = sc.nextInt();
            big = num > big? num : big;
            count++;
        }
        System.out.println("the biggest number is " + big);

    }
}
// Task-> girilen 7 sayının en buyugunu print eden code create ediniz