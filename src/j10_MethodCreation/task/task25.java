package j10_MethodCreation.task;


import java.util.Scanner;

public class task25 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        fakCalc();

    }
    public static void fakCalc() {
        System.out.println("Bitte schreiben Sie eine Nummer: ");
        int num = input.nextInt();
        int sum =1;
        for(int i=1; i<=num; i++) {
            sum *= i;
        }
        System.out.print(sum);
    }
}
