package j08_loops;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an input: ");
        int num = input.nextInt();
        int factorial = 1;//int type variable tanımlandı

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("bizin gızz girdigin sayının faktöriyeli : " + factorial);
    }
}
// task-> girilen sayının faktöriyelini print code create ediniz
//falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan