public class homework {
    public static void main(String[] args) {

        // Task 1 //
        System.out.println("Derse Hosgeldin");

        // Task 2 //
        int number = 30;
        System.out.println(number);

        // Task 3 //
        double num1 = 10.1;
        double num2 = 10.2;
        double sum  = num1 + num2;
        System.out.println(sum);

        // Task 4 //
        String name = "Yusuf";
        String lastName = "Kara";
        String lastNameSpace = name + " " + lastName;
        System.out.printf(lastNameSpace);

        // Task 5 //
        boolean bVariable = true;
        System.out.println(bVariable);

        // Task 6 //
        String text = "\"Java Canlar\"\n hazir\t miyiz";
        System.out.println(text);

        // Task 7 //
        int num = 5;
        byte newNum = (byte) num;
        System.out.println(newNum);

        // Task 8 //
        int num3 = 1;
        double newNum1 = (double) num3;
        System.out.println(newNum1);

        // Task 9 //
        int num4 = 2;
        long newNum2 = (long) num4;
        System.out.println(newNum2);

        // Task 10 //
        double num5 = 10.2;
        int newNum3 = (int) num5;
        System.out.println(newNum3);

        // Task 11 //
        int num6 = 15;
        String convertedNum = String.valueOf(num6);
        System.out.println(convertedNum);

        // Task 12 //
        double num7 = 12.2;
        String convertedNum2 = String.valueOf(num7);
        System.out.println(convertedNum2);

        // Task 13 //
        String input = "25";
        int convertedStr = Integer.parseInt(input);
        System.out.println(convertedStr);

        // Task 14 //
        String input1 = "10.6";
        double convertedStr2 = Double.parseDouble(input1);
        System.out.println(convertedStr2);

        // Task 15 //
        int sayi = 10;
        int yeniSayi = sayi+1;
        System.out.println(yeniSayi);

        // Task 16 //
        int sayi2 = 15;
        sayi2 = sayi2 / 2;
        System.out.println(sayi2);

        // Task 17 //
        int sayi3 = 15;
        sayi3 = sayi2/2*2;
        System.out.println(sayi3);

        // Task 18 //
        double vizeNotu = 41, finalNotu = 60;
        int sonucNot = (int) ((vizeNotu+finalNotu)/2);
        System.out.println(sonucNot);

        // Task 19 //
        char ch = 'A';
        System.out.println("ch+0 = " + (ch+0));

        // Task 20 //
        char ch1 = 'A';
        System.out.println("ch1+0 = " +  ch1+0 );

        // Task 21 //
        int sayi4 = 10;
        sayi4 +=5;
        sayi4++;
        System.out.println(sayi4);

        // Task 21 //
        int sayi5 = 10;
        sayi5*=5;
        sayi5 = sayi5 +12;
        sayi5--;
        sayi5-=3;
        System.out.println(sayi5);

        // Task 22 //
        int cemberCap = 3;
        double pi = 22/7;
        int hesap = (int) (pi*2);
        int cemberCevre = (hesap*cemberCap);
        System.out.println(cemberCevre);

        // Task 23 //
        int a= 10 , b= 20 , c=20 , x=5 , y= 10 , z= 15;
        boolean sonuc1 = (a==b);
        System.out.println(sonuc1);

        boolean sonuc2 = (a<b);
        System.out.println(sonuc2);

        boolean sonuc3 = (a>=b);
        System.out.println(sonuc3);

        boolean sonuc4 = (b==b);
        System.out.println(sonuc4);

        boolean sonuc5 = (a<=b);
        System.out.println(sonuc5);

        boolean sonuc6 = (a!=b);
        System.out.println(sonuc6);

        System.out.println((a==c));
        System.out.println((c!=c));
        System.out.println((x==5) && (z==15));
        System.out.println((x==5) || (z==15));
        System.out.println((x==5) || (z==15));
        System.out.println((x==5) && !(y==15));
        System.out.println(!(x==5) || (y==15));

        boolean sonuc7 = (a==b && a!=c);
        System.out.println("sonuc = " + sonuc7);

        boolean sonuc8=(a==b || a!=c);
        System.out.println("sonuc = " + sonuc8);

        boolean sonuc9=(b<=c && a!=c);
        System.out.println("sonuc = " + sonuc9);

    }
}
