package j12_Arrays;

public class task03 {
    public static void main(String[] args) {
        int arr[] = {25, 30, 30, 35, 100};
        int toplam=0;

        for ( int i=0; i <arr.length;i++){
            toplam+=arr[i];
        }
        System.out.println("toplam = " + toplam);



    }
}
/*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */
