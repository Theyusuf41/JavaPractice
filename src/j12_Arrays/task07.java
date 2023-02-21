package j12_Arrays;

public class task07 {
    public static void main(String[] args) {
        int numbers [] = {12,2,5,15,8,50};
        int max = numbers[0];

        for(int i=0; i< numbers.length;i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("The biggest number is " + max);

    }
}
 /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
*/