package j07_stringManipulation;

import java.util.Scanner;

public class homework7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write a Text");
        String value = input.next();

        System.out.println("Please enter the Index number :");
        int index = input.nextInt();

        if(index<0 || index>value.length()) {
            System.out.println("False output");
        }else
            System.out.println("The Index  is =" + index + value.charAt(index));
    }
}
/*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */