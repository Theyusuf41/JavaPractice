package j13_ArrayList.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        ArrayList<Integer> profitDailyBasis = new ArrayList<>(Arrays.asList());

        Scanner scanner = new Scanner(System.in);
        int counter = 7;
        int profitMoney=0;
        while(true) {
            System.out.println("Gunluk kazancini gir !" );
            int money = scanner.nextInt();
            profitDailyBasis.add(money);
            counter--;
            if(counter==0) break;
        }
        for (int x: profitDailyBasis ) {
            profitMoney+=x;
        }
        System.out.println("Haftalik ortalama kazanciniz: " +getAvearage(profitMoney));
        aboveAverageProfit(profitMoney , profitDailyBasis ,days);






    }

    public static void aboveAverageProfit(int profitMoney, ArrayList<Integer> profitDailyBasis , ArrayList<String>days) {
        for(int i=0; i<profitDailyBasis.size(); i++) {
            if(profitDailyBasis.get(i) >= (profitMoney/ days.size())){ // hata aliyorum bakicam tekrar
                for(int j=0; j< days.size(); j++){
                    System.out.println("Su gun: " + days.get(i) + " kazanciniz ortalama ustu");
                    break;
                }
            }
        }


    }

    public static int getAvearage(int profitMoney) {
        int a = (profitMoney/7);
        return a;
    }


}
/* TASK :
 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
 * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
 *
 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
 * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
 * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle. +
 * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın. +
 * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 * 			 ortalama kazançtan yüksekse o günleri return yap.
 * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 * 			 ortalama kazançtan aşağıysa o günleri return yap.
 * */