package j13_ArrayList.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ahmetBeyTask {
    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */
            Scanner sc = new Scanner(System.in);
            ArrayList<String> gunler= new ArrayList<>();
            gunler.addAll(Arrays.asList("Pazartesi", "Sali", "Carsanba", "Persenbe","Cuma", "Cumartesi", "Pazar"));



            ArrayList<Integer> gunlukKazanclar= new ArrayList<>();
            int ortalamaHesabi=0;

            for (int i = 1; i <= gunlukKazanclar.size() ; i++) {
                System.out.print(gunler.get(i-1)+" gunu yapilan ciroyu giriniz  :  ");
                int gelir=sc.nextInt();
                gunlukKazanclar.add(gelir);
            }
        for (int x:gunlukKazanclar ) {
            ortalamaHesabi+=x;
        }
        System.out.println(ortalamaHesabi + " Haftalik kazanc");
            int ortalamaKazanc=getOrtalamaKazanc(gunlukKazanclar);
            System.out.println("Bu market in gunluk ortalama cirosu  :"+ortalamaKazanc+" TL");
            getOrtalamaninUstundeKazancGünleri(gunlukKazanclar, ortalamaHesabi);
        }

        private static void getOrtalamaninUstundeKazancGünleri(ArrayList<Integer> gunlukKazanclar , int ortalamaHesabi) {

            for (int i = 0; i < gunlukKazanclar.size()  ; i++) {
                if(gunlukKazanclar.get(i) >= (ortalamaHesabi/7)){
                    System.out.println("Su miktarlar ortalamadan fazla : " + gunlukKazanclar.get(i));
                }
            }

        }


        private static int getOrtalamaKazanc(ArrayList<Integer> gunlukKazanclar) {
            int sum = 0;

            for (int i = 0; i < gunlukKazanclar.size() ; i++) {
                sum+=gunlukKazanclar.get(i);

            }
            int toplam=(sum/7);
            return toplam;
        }
    }

