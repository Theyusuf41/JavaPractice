package j12_Arrays;

import java.util.Arrays;

public class exercies04 {
    public static void main(String[] args) {
        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        int sum [] = new int[sayi.length];
        for(int i=0;i< sayi.length;i++){
            for(int j=0; j<sayi[i].length; j++){
                sum[i] += sayi[i][j];

            }
        }
        System.out.println(Arrays.toString(sum));
    }
}
// task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz
// input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
// output : int yeniArr[]={6,11,-7}