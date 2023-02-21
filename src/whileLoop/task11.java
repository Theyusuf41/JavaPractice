package whileLoop;


import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0 , count=0;

        while(true) {
            System.out.println("Please enter a number : ");
            int num = input.nextInt();
            sum+=num;
            count++;
            if(num==0) {
                System.out.println("0 girdiniz! ");
                break;
            }
        }
        System.out.println("sum of numbers : " + sum +"\n" + "count of number : " + count);



    }
}
   /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */