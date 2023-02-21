package j10_MethodCreation.task;

import java.util.Scanner;

public class task15 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String cities = citiesToTravel();
        int age = ageDiscount();



    }






    public static int ageDiscount() {
        int age=5;
        return age;
    }

    public static String citiesToTravel() {
        System.out.println("Wohin möchten Sie fahren ? \n B - C - D ");
        String city = input.nextLine();

        return city;

    }
}
/*
A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
Bilet tarifesi:
km birim fiyati : 0.10$
yolcu 12 yasindan kucukse toplam fiyata %50 indirim,
12 ve 24 yas arasindaysa 10% indirim,
65 yasindan buyukse 30% indirim,
bilet gidis donus alinirsa 20% indirim uygulayan bir app create ediniz
 */