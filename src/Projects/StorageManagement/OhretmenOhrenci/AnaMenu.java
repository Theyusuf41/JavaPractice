package Projects.StorageManagement.OhretmenOhrenci;

import java.util.Scanner;

import static Projects.StorageManagement.OhretmenOhrenci.OgretmenIslemleri.ogretmenIslemMenu;


public class AnaMenu implements AnaMenuIslemler {
    static Scanner input = new Scanner(System.in);


    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";




    public static void girisPaneli() {
        AnaMenu menuObj = new AnaMenu();//class'dan non-static meth call için obj create edildi
        System.out.println(R + "========================== OKUL YONETİMİ =======================\r\n"
                + "   ____________________             ____________________    \n"
                + "  |1-ÖĞRENCİ İŞLEMLERİ |           |2-ÖĞRETMEN İŞLEMLERİ |  \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "                    ____________________                    \n"
                + "                   |      Q-ÇIKIŞ       |                   \n"
                + "                    ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯                    \n"+ B
                +" ======================== HOŞ GELDİNİZ=======================\n"+R
        );


        System.out.print("lütfen seçiminizi yapınız : ");



        switch(input.next().toUpperCase()){
            case "1":
                menuObj.ogrenciIslemleri();
                break;
            case "2":
                menuObj.ogretmenIslemlerı();
                break;
            case "Q":
                menuObj.cikis();
                break;
            default :

        }
    }
    public static void işlemMenu() {


        System.out.println("========================== İŞLEMLER =======================\r\n"
                + "   ____________________             ____________________    \n"
                + "   |    1-EKLEME       |            |     2-ARAMA       |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   |    3-LİSTELEME    |            |     4-SİLME       |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   |    5-ANA MENU     |            |     6-CIKIS       |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n" +
                "========================== İŞLEMLER ========================" );




    }


    @Override
    public void ogrenciIslemleri() {
        ogretmenIslemMenu();
    }

    @Override
    public void ogretmenIslemlerı() {

    }

    @Override
    public void cikis() {

    }

}
