package j08_loops;


import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a text :");
        System.out.println("Please enter a letter :");
        char letter = input.nextLine().charAt(0);
        String str = input.nextLine();
        System.out.println(str.substring(str.indexOf(letter), 11));



    }
}
// task-> girilen  bir char karakterden sonra gelen 10 karakteri prin eden code create ediniz