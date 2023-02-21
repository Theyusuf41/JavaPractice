package j07_stringManipulation;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birseyler yazin");
        String str = input.nextLine();

        System.out.println(str.substring(0, str.length() - 1));
    }
}
/*
        Girilen String'in son karakterini silen code create ediniz...
         */