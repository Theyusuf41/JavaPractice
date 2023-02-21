package j12_Arrays;

import java.sql.SQLOutput;

public class task11 {
    public static void main(String[] args) {

        int numbers [] = {12, 14 , 21 ,23 , 10 ,4};
        int sum=0;

        for(int i=0; i< numbers.length; i++) {

            sum+=numbers[i];

        }
        System.out.println(sum / numbers.length);
    }
}

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */