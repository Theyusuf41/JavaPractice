package j27_Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SIcaklik gir: ");
        int temp = scanner.nextInt();
        try {
            controlTemp(temp);

        }catch (IOException e) {
            System.out.println("Mesaj");
        }
    }

    private static void controlTemp(int temp) throws IOException {
        if(temp<10) {
            throw new IOException("Yoo sicak");
        }

    }


}
/*
Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
edip mainde kontrol ediniz.

Trick->
sicaklikKontrol(int sıcaklık){
 throw new IOException("AGAM haba buz gibi dışarı çıkma");

} */