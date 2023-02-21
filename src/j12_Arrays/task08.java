package j12_Arrays;

public class task08 {
    public static void main(String[] args) {
        int numbers [] = {14 , 19 , 5 , 21};
        int min = numbers[0];

        for(int i=0; i< numbers.length;i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("The smallest number is " + min);

    }
    }

/*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */