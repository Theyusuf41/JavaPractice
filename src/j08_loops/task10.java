package j08_loops;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write some string: ");
        String str = input.nextLine();
        System.out.println("Please enter a letter ");
        char letter = input.nextLine().charAt(0);
        int harf =0;

        for(int i=0; i<=str.length()-1; i++) {
            if(str.charAt(i) == letter){
                harf++;
            }
        }
        System.out.println(str + harf);

    }
}
