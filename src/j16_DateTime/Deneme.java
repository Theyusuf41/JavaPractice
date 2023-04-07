package j16_DateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Once yil");
        System.out.println("Once ay");
        System.out.println("Once gun");


        LocalDate date3 = LocalDate.of(input.nextInt(),input.nextInt(),input.nextInt());
        System.out.println(date3);
    }
}
