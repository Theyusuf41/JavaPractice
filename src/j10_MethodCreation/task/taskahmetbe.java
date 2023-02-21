package j10_MethodCreation.task;


import java.util.Scanner;

public class taskahmetbe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String day = "monday";
        switch (day) {
            case "monday":
                System.out.println("Today is Saturday");
                break;
            case "7":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

            System.out.println("Nereye gitmek istiyorsunuz?");
            String sehir = input.nextLine();
            System.out.println("hata burda mi");
            switch (sehir) {
                case    "B":
                    System.out.println("yoksa");
                    break;
                case    "C":
                    System.out.println("neresi");
                    break;
                case    "D":
                    System.out.println("burdaamiyiz");
                    break;
                default:
                    System.out.println("Lutfen belirtilen bir deger giriniz..");


            }




    }
}
