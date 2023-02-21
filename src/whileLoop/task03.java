package whileLoop;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int num = input.nextInt();
        int i =1;

        while(i<=10) {
            System.out.println(num + "x" + i + "=" + num*i);
            i++;
        }

    }
}
//task-> girilen tamsayı için çarpım tablosu print eden code create ediniz
//input: 8-> output :8x1=8, 8x2=16... 8x10=80