package Projects.StorageManagement.OhretmenOhrenci;

import java.util.Scanner;

public class TryCatches {

    public static int integerGiris() {
        Scanner scan =new Scanner(System.in);
        int giris =0;
        boolean flag=false;

        do {

            if (flag==true){
                scan.nextLine();
                flag=false;
            }                                     //ctrl +alt +t
            try {
                giris =scan.nextInt();
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Hatalı giriş yaptınız");
                flag =true;
                integerGiris();

            }
        }while(flag);


        return giris;
    }
}
