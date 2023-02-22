package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task11 {
    public static void main(String[] args) {
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String [] money = new String[] {str};
        ArrayList<Integer> dollars = new ArrayList<>();
        ArrayList<Integer> pounds = new ArrayList<>();
        int sum =0;

        for(int i=0; i<money.length; i++) {
            if(money[i]== "$"){
                money[i]=money[i].replaceAll("\\D", "");
                sum+=Integer.parseInt(money[i]);
                dollars.add(sum);
            }else if(money[i] == "£"){
                money[i]=money[i].replaceAll("\\D", "");
                sum+=Integer.parseInt(money[i]);
                pounds.add(sum);
            }
        }
        System.out.println(dollars + " toplam dolar ");
        System.out.println(pounds + " toplam pound ");


    }
}
/*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup print eden code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */