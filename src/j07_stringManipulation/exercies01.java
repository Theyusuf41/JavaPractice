package j07_stringManipulation;

import java.util.Scanner;

public class exercies01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        System.out.println("Please enter a second string");
        String input1 = input.nextLine();
        String input2 = input.nextLine();

        System.out.println(input1 == input2);
        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));
    }
}
