package extraExercies;


import java.util.Scanner;

public class methodExercies05 {
    static Scanner input = new Scanner(System.in);
    static int amountOfMoney = 1000;
    public static void main(String[] args) {
        System.out.println("Welcome to the our Bank! \n Please enter 1 to see actions or enter 0 to exit");
        int decision = input.nextInt();

        if(decision==1) makeInterest();
        else if (decision==0) {
            System.out.println("See you later! ");
        }

    }

    public static void makeInterest() {
        System.out.println("Our rate of interest is \n 1 year -> %5 \n 2 year -> %7 \n 3 year -> %9 \n please type 1-2 or 3 basis on year");
        int yearOfInterest = input.nextInt();

        switch (yearOfInterest) {

            case 1:
                oneYearCal();
                break;
            case 2:
                twoYearCal();
                break;
            case 3:
                threeYearCal();
                break;
            default:
                System.out.println("Invalid Input!!");
        }
    }

    public static void oneYearCal() {
        System.out.println(((amountOfMoney * 12) * 100 / 5));
    }

    public static void twoYearCal() {
        System.out.println(((amountOfMoney * 24) * 100 / 7));
    }

    public static void threeYearCal() {
        System.out.println(((amountOfMoney * 36) * 100 / 9));
    }




}
