package j12_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task16 {
    public static void main(String[] args) {
        String money []={"$12", "$23", "$10", "$2", "$5", "$2"};


        int sum=0;

        for (int i = 0; i < money.length ; i++) {
            money[i]=money[i].replaceAll("\\D", "");
            sum+=Integer.parseInt(money[i]);

        }

        System.out.println("sum :"+ sum + "$");


    }
}
/*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
*/
