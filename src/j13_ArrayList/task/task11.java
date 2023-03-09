package j13_ArrayList.task;

import java.util.ArrayList;
import java.util.Scanner;

public class task11 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        findPrimer();

    }

    public static void findPrimer() {
        System.out.println("Sayi giriniz: ");
        int num = scanner.nextInt();
        ArrayList<Integer> listNumbers = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            if(num%i==0) {
                listNumbers.add(i);
            }
        }
        System.out.println(listNumbers);
    }
}
/*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */