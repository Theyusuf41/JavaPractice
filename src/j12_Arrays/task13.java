package j12_Arrays;

import java.util.Arrays;

public class task13 {
    public static void main(String[] args) {
           int numbers [] = {1,0,0,1,0,2,4,0};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
 /*

   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */