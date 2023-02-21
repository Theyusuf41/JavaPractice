package j08_loops;


import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = input.nextInt();
        int sum = 0;

        for(int i=0; i<num; i++) {
            sum+=i*i;
        }
        System.out.println(sum);
    }
}
// girilen tam sayiya kadar olan sayilarin karelerini toplayalim: //
/*

 */