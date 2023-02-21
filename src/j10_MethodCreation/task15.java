package j10_MethodCreation;

import java.util.Scanner;

public class task15 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Wohin möchten Sie fahren ? \n B \n C \n D");
        String cities = input.nextLine();

        System.out.println(citiesToTravelCal(cities));

    }

    private static String citiesToTravelCal(String cities) {
        switch (cities) {
            case "B":
                discountBasedOnAge();

                break;
            case "C":


                break;
            case "D":
                break;
        }


        return cities;
    } //  return unutma




    private static void discountBasedOnAge() {
        double distancePrice = 500 * 0.10;
        System.out.println("Bitte geben Sie Ihr ALter :");
        int age = input.nextInt();
        if(age<=12 && age>0) {
            double price = distancePrice * 0.50 ;
            System.out.println(price + " Euro");
        }
        else if(age>12 || age<=24) {
            double price = distancePrice - (distancePrice*0.10) ;
            System.out.println(price + " Euro");
        }else if(age>=65) {
            double price = distancePrice- (distancePrice*0.30);
            System.out.println(price + " Euro");
        }

    }
}
 /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyata %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bir app create ediniz
     */