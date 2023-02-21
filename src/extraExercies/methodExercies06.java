package extraExercies;

import java.util.Scanner;

public class methodExercies06 {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.print("Please enter a password! ");
        for(int i=0; i<=1; i++) {
            lenghtControl();
            symbolControl();
            digitControl();
        }


    }
    public static void lenghtControl () {
        String password = input.nextLine();
        System.out.println((password.length() >= 10) ? "First condition is true" : "First condition is false");
    }
    public static void symbolControl () {
        String password = input.nextLine();
        if(password.contains("\\W")) System.out.println("False symbol");
    }
    public static void digitControl () {
        String password = input.nextLine();
        int count=0;
        for(int i=0; i<=password.length()-1; i++) {
            if(Character.isDigit(password.charAt(i))) count++;
        }
        System.out.println((count >= 2) ? "Okay" : "No okay");
    }
}
