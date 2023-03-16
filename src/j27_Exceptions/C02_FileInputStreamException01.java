package j27_Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class C02_FileInputStreamException01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("C:\\Users\\yusuf\\IdeaProjects\\working\\src\\j26_Exceptions\\random");
        // fis path verilen path'e erisim saglar
        // FileNotFoundException -> yolu belirlenen file path yanlissa durumu kurtarmak icin kullanilan yontem
        int k;
        while((k= fis.read()) !=-1) { // fis.ready dosyadakileri okumak icindir bu nedenle yeni bir exception throw etmesi gerekir buda -> IOException'dir
            System.out.print((char) k);

        }
    }
}
