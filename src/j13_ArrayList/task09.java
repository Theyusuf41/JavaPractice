package j13_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie Höhe von ArrayList ein: ");
        int lenght = input.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i<lenght;i++){
            System.out.println("Bitte geben Sie 5 Nummer ein: ");
            int num = input.nextInt();
            numbers.add(num);
            System.out.println(numbers);
        }
        Collections.reverse(numbers);
        System.out.println(numbers + " reversed Arraylist ");

    }
}
// Task -> Girilen 5 sayıyı , giriş sırasına göre tersten print eden code create ediniz