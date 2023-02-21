package j08_loops;


import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = input.nextInt();

        for(int i=(num1<num2 ? num1 : num2); i<=(num1>num2 ? num1 : num2); i++) {
            System.out.print((i % 2 == 0 ? i + " " : ""));
        }

    }
}
// task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...