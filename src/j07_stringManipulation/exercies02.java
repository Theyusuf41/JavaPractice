package j07_stringManipulation;


import java.util.Objects;
import java.util.Scanner;

public class exercies02 {
    // First Input is username and it should not be showned
    // Second Input is the Password of the user, therefore it should not been showend.
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Please enter your password (At least 6 Character!!): \n Your passcode  will be cencorid.");

        String password = src.next();

        // System.out.println((password.length() >= 6) ? "Your passcode is strong" : "Please enter at least 6 Digit Passcode ");

        if(password.length()>=6) {
            System.out.println("Your passcode is strong");
        } else
            System.out.println("Please enter at least 6 Digit Passcode ");

        System.out.println(password.replaceAll("\\w", "*"));

        // The String is controlled if it is empty or irrelevant things included




        System.out.println("Please enter your username: \n First Letter of your username will be cencorid.");
        String username = src.next();

        if(username.isEmpty()) {
            System.out.println("Invalid Input");
        } else if (username.contains("\\D")) {
            System.out.println("Invalid Inputtttt ");
        } else
            System.out.println("Everyting seems correctto");

        System.out.println(username.charAt(0) + username.substring(1, username.length()-1).replaceAll("\\w", "*"));


    }
}
