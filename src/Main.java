import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           /* String bootcamp = "clarusway";
            String name     = "Yusuf ALi";
            int age         = 25;
            double salary   = 843.12;
            System.out.println("bootcamp name:" + bootcamp); */

        /* int number1 = 20;
        int number2 = 34;
        int temp    = number1;
        number1     = number2;
        number2     = temp;

        System.out.println(number1);
        System.out.println(number2); */


        /*int number1 = 10;
        int number2 = 50;
        int temp    = number2;
        number2     = number1;
        number1     = temp;

        System.out.println(number1);
        System.out.println(number2);   */


        System.out.println("Was ist Ihre Name?");
        Scanner input = new Scanner(System.in);

        String name = input.next();

        System.out.println("Wie alt sind Sie?");
        int yas = input.nextInt();

        System.out.println("Hallo" + name);
        System.out.println("Sie sind" + yas +" jahre alt ");




    }
}