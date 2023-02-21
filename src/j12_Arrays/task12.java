package j12_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Array'in uzunlugu? ");
        int lenghtOfArray = input.nextInt();
        int arr [] = new int[lenghtOfArray]; // yeni array icin lenght ayarladik simdi elemanlarini almak icin for acilacak

        for(int i=0; i<arr.length; i++ ){
            System.out.println("Array'in elemanlari ? ");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr) + "girilen Array ");
        //String str = Arrays.toString(arr);


        // Bu kisimda icinde olan elemanlari kontrol etme kisminda takildim ! //
        for(int i=0; i<arr.length; i++ ){
            if(arr[i] == 2 || arr[i] ==4){
                System.out.println("true");
            } else System.out.println("false");
        }




    }
}
 /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */