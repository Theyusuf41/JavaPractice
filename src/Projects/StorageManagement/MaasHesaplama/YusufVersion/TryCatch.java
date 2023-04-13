package Projects.StorageManagement.MaasHesaplama.YusufVersion;

import static Projects.StorageManagement.MaasHesaplama.YusufVersion.Islemler.scan;

public class TryCatch {
    public static int secimTry() {
        var flag = false;
        var num =0;
        do{
            if(scan.hasNextInt()){// bir sonraki
                num = scan.nextInt();
                flag= true;
            }else {
                scan.nextLine();
                System.out.println("Harf yerine sayi giriniz");
            }
        }while(!flag);
        return num;
    }


}
