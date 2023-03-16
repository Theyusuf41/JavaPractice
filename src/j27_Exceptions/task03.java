package j27_Exceptions;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vize gir: ");
        int v = scanner.nextInt();
        System.out.println("Final gir: ");
        int f = scanner.nextInt();

        try {
            ortalama(v,f);
        }catch (ArithmeticException e) {
            System.out.println();
        }

    }

    private static void ortalama(int v, int f) throws ArithmeticException {
        double mid = ((v*0.4) + (f*0.6));
        if(v>100 || f>100) {
            throw new ArithmeticException("Notlar 0-100 arasında olmalı");
        }else System.out.println("bihtim ya");
    }
}
/*
'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
int v = vize
int f = final

Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
Diğer durumlarda ise,
vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)
vizeye 120, finale 80 girin.

Programın çalışmasını sağlayın. (handle edin)
 */