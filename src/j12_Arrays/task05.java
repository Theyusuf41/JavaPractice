package j12_Arrays;

public class task05 {
    public static void main(String[] args) {
        int numbers [] = {5,6,8,12,14,19};
        int tek=0;
        int cift=0;

        for(int i=0; i< numbers.length; i++) {
            if(numbers[i]%2==0){
                cift+=numbers[i];
            }else if(numbers[i]%2!=0) {
                tek-=numbers[i];
            }
        }
        System.out.println(cift+tek);

    }
}
 /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */