package j08_loops;

import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("bizim oolann bi sayi gir bakennn : ");
        int sayi = input.nextInt();
        int rakToplami = 0;//işleme etki etmeyecek boş kutu tanımlandı

        for (int i = sayi; i > 0; i = i / 10) {//sayında başlayıp her tekrarda basamka syısı bir azalan döngü tanımlandı
            rakToplami+=i%10;
        }
        System.out.println("rakToplami = " + rakToplami);
    }
}
//task -> verilen bir tam sayinin rakamlari toplamini print eden code create ediniz