package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi gir ulan!! ");
        int num = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,46,44,27,21,79,31,20,58,38,59,33));
        System.out.println(list.contains(num));

    }
}
// bir listte istenen sayinin varligini kontrol ediniz: