package j15_Varargs;

import java.util.ArrayList;
import java.util.Scanner;

public class C04_Task02 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int numbersArr [] = {24,23,38,33,21,59,26,10};
        calcNumbers(numbersArr);


    }

    private static void calcNumbers(int numbersArr[]) {
        int firstNum =0;
        int sum =0;
        for(int i=0; i< numbersArr.length; i++) {
            if(numbersArr[i]==0){
                firstNum+=numbersArr[i];

            }else sum+=numbersArr[i];
        }
        System.out.println(sum * firstNum);


    }
}
// Task-> Girilen ilk sayi haric digerlerini toplayan ve ilk sayi ile carpan Method create ediniz: