package j12_Arrays;

import java.util.Arrays;

public class task09 {
    public static void main(String[] args) {
        int numbers [] = {15,25,22,18,30};
        Arrays.sort(numbers);
        int arr  = numbers[numbers.length-2];
        System.out.println(arr);


        /*for(int i=0; i< numbers.length; i++) {
            if(numbers[i]>= 1){
                System.out.println(numbers[i]);
                break;
            }
        } */


    }
}
/*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
*/