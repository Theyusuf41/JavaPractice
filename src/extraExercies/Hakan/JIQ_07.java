package extraExercies.Hakan;

import java.util.Scanner;

public class JIQ_07 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        oddOrEven();




    }

    private static void oddOrEven() {
        System.out.println("Bitte geben Sie eine Nummer ein ");
        int num = scan.nextInt();
        System.out.println((num % 2 == 0) ? "Even" : "Odd");
    }
}
// Write a method which can identifies given number is even or odd