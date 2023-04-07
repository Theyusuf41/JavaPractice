package Projects.StorageManagement.OhretmenOhrenci;

import java.util.Scanner;

public class TcKontrol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        kimlikNoDogrulama ("");
    }
    public static void kimlikNoDogrulama (String kimlikNo){

        int onuncuRakam = Integer.parseInt(kimlikNo.substring(9, 10));
        int onbirinciRakam = Integer.parseInt(kimlikNo.substring(10));

        if (kimlikNo.length()==11) { // 11 haneli check

            int toplamCift = 0;    //kural 1 vairable
            int toplamTek = 0;     //Kural 1 variable

            for (int i = 0; i <kimlikNo.length()-2 ; i++) { //KURAL 1 variable assignment

                if (Character.isDigit(kimlikNo.charAt(i))){ //isDigit Check
                    if (i%2==0){
                        toplamTek+=Integer.parseInt(kimlikNo.substring(i,i+1));
                    }else {
                        toplamCift+=Integer.parseInt(kimlikNo.substring(i,(i+1)));
                    }
                }else {
                    System.out.println("Lütfen sadece sayı kullanınız! !");
                   // ekle();
                    break; //Kullanılmayabilir?
                }
            }
            // System.out.println("toplamTek = " + toplamTek);
            // System.out.println("toplamCift = " + toplamCift);

            if ((toplamTek*7+toplamCift*9)%10==onuncuRakam &((toplamTek*8)%10)==onbirinciRakam){ //KURAL 2 CHECK
            }else {
                System.out.println("Geçersiz kimlik no tekrar deneyiniz! ");
              //  ekle();
            }
        }
        else {
            System.out.println("Kimlik no 11 haneden oluşmalıdır ! ");
          //  ekle();
        }

        int toplamRakam=0;
        for (int i = 0; i <kimlikNo.length()-1 ; i++) { //KURAL 2 variable assignment
            toplamRakam+=Integer.parseInt(kimlikNo.substring(i,i+1));
        }

        if (!(toplamRakam%10==onbirinciRakam)){ //KURAL 2 CHECK
            System.out.println("Lütfen geçerli bir kimlik no giriniz !");
           // ekle();
        }
    }
}

