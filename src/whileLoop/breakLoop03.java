package whileLoop;

import java.util.Scanner;

public class breakLoop03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pin = "javaCan";
        int count = 3;

        while(true) {
            System.out.println("Pin gir bakalim");
            if(input.nextLine().equals(pin)) {
                System.out.println("Correcto");
                break;
            }else System.out.println("Toplamda 3 yanlis hakkin var: ");
            count--;
            if(count==0) {
                System.out.println("Daha fazla yanlis yapma hakkin yok !");
                break;
            }
            }
        }


        }



// Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
/*        String dgrPin = "javaCAN";
        while (true) {

        System.out.print("gakgom hele bi pin cizikdiresen ha :");
        if (dgrPin.equals(input.nextLine())) {
        System.out.println("Gakgom böyün ballı günüğndesin haa :)");
        break;
        } else {
        System.out.println("gakgom hele bi daha pin cizikdiresen ha :");
        ;
        grsHkk--;
        System.out.println("Gakgom kalan hakkın : " + grsHkk);
        if (grsHkk == 0) {
        System.out.println("Gakgom hiç canın kalmadı bekleme yapma DEWAMKEEE ");
        break;
        }
        } */