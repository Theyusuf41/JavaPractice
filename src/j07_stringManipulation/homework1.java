package j07_stringManipulation;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String type data : ");
        String str = input.nextLine();
        System.out.println(str.contains(" "));

    } }
