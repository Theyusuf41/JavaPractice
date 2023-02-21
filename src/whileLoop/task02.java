package whileLoop;


import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1= input.nextInt();
        System.out.println("Please enter the second number: ");
        int num2= input.nextInt();
        int i =0;

        while(i<=((num1>num2)? num1 : num2)) {
            System.out.print(i);
            i++;
        }

    }
}
 /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while loop
         */