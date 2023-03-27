package extraExercies.Mevlut;


import java.util.Scanner;
import java.util.stream.IntStream;

public class JIQ_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int num =input.nextInt();
        var sum=1;

        for (int i = 1; i <=num ; i++) {
            sum*=i;
        }
        System.out.println(sum);

        var f = IntStream.rangeClosed(1,num).reduce(1,(x,y) -> x*y);
        System.out.println(f);


    }
}
// faktoriyel