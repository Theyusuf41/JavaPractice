package j08_loops;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write a string: ");
        String str = input.nextLine();

        for(int i=0; i<1; i++) {
            System.out.println(str.replaceAll("[^0-9]", ""));

        }
    }
}
/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */