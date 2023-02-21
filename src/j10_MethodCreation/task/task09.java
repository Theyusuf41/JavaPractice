package j10_MethodCreation.task;


import java.util.Scanner;

public class task09 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        hourtoSecond();

    }

    private static void hourtoSecond() {
        System.out.println("Bitte geben Sie eine Uhrzeit :");
        double hour = input.nextInt();
        System.out.println(((hour * 60) * 60) + "");
    }


}
/*
   Task->  Saati saniyeye çeviren  method create ediniz


    */