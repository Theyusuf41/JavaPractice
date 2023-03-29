package depoYonetimiYusuf;

import java.util.InputMismatchException;
import java.util.Scanner;

import static depoYonetimiYusuf.Islemler.scan;

public class TryCatch {
    /*public static int intTry(){
        int data = scan.nextInt();
        int giris = 0;
        boolean flag1 = false;
        do {
            try{
                if(flag1==true) flag1=false;
                giris= scan.nextInt();

                if(giris<0) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (IllegalArgumentException e) {
                flag1 = true;
                System.out.println("Pozitif bir deger giriniz!");
            }catch (InputMismatchException e) {
                flag1 = true;
                System.out.println("Rakam giriniz!");
            }catch (Exception e) {
                flag1 = true;
                System.out.println("Gecerli bir deger giriniz!");
            }

        }while(flag1);
        return giris;
    }*/
    public static int secimTry(){
        var flag = false; //
        var num = 0;
        do{
            if(scan.hasNextInt()){ // hasNextInt methodu ile scanner icindeki degerleri kontrol edebiliriz.
                num = scan.nextInt();
                flag = true;
            }else {
                scan.nextLine();
                System.out.println("Sayi gir ");
            }
        }while(!flag);
        return num;
    }
}
