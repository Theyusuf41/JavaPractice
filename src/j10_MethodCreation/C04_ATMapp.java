package j10_MethodCreation;

import java.util.Scanner;

public class C04_ATMapp {
    static Scanner input = new Scanner(System.in);//class level en tepeye gökdeki güneş yapıldı ki herkes ulaşabilsin
    static int bakıye = 1500;//class level en tepeye gökdeki güneş yapıldı ki herkes ulaşabilsin

    public static void main(String[] args) {
        /*
        baslangıc bakıye $1500 sorgu, para çekme-yatırma ve çıkış işlemlerini yapan bir ATM app create ediniz.
         */
        sonKarar();


    }//main sonu

    public static void sonKarar() {

        System.out.println("agam \ndewamkee ->1\nyeter ->0");
        int seçim = input.nextInt();
        if (seçim == 1) {
            System.out.println("işlem menüsü: \nBakıye sorgu->1\nPara çekme->2\nPara yatırma->3\nÇıkış->4");
            islemTercih();
        } else if (seçim == 0) {
            ckıs();
        } else System.out.println(" AGAM adam gibi bişey giresen ");


    }

    public static void islemTercih() {
        System.out.print("AGAM işlemini seç : ");

        int islemSecim = input.nextInt();

        switch (islemSecim) {

            case 1://1.işlem bakıye sorgu
                bakiyeSorgula();
                sonKarar();
                break;
            case 2://2. işlem para-çekme


                break;
            case 3://3.işlem para yatırma
                paraYatır();
                sonKarar();

                break;
            case 4://4.işlem çıkış
                ckıs();

                break;
            default:
                System.out.println("lütfen geçerli değer giriniz  ");


        }
    }

    private static void paraYatır() {
        System.out.print("yatıracagınız miktarı giriniz : ");
        int yatanMiktar=input.nextInt();
        bakıye+= yatanMiktar;
        System.out.println("hesabınıza "+yatanMiktar+" geçmiştir " );
    }

    private static void ckıs() {
        System.out.println("çıkış işleminiz başarı ile yapılmıştır. Yine bekleriz.. SELAMETLE ");
    }

    private static void bakiyeSorgula() {
        System.out.println("Güncel  bakıyeniz : " + bakıye);
    }
}//Class sonu
