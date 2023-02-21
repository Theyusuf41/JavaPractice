package j12_Arrays;

import java.util.Arrays;

public class task06 {
    public static void main(String[] args) {
        String fruits [] = {"Apple", "Pineapple" , "Orange" };
        Arrays.sort(fruits);

        for(int i=0; i< fruits.length; i++) {
            if(fruits[i] == "Apple") {
                System.out.println("true");
            }
        }


    }
}
/*
        String array oluşturun ve elemanları : Apple , Orange ,  , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
*/