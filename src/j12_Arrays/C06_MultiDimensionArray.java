package j12_Arrays;

public class C06_MultiDimensionArray {
    public static void main(String[] args) {
        int arr1 [][] = new int[3][5];  // 3 kat 5 daire olan bos Multidementional array declare edildi.
        // 12dairelik 7 katli 5 ap nasil array olarak tanimlanir.
        int arr2 [][][] = new int[5][7][12];
        // Eleman eklemek
        arr1[2][3] = 43; // 2. kat 3. daireye 41 atandi.



    }
}
/*
Çok Boyutlu Diziler
      Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
       Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
       formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
       matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
       satır ve sütun sayısını girmemiz yeterli olacaktır.
      * TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
      Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

 * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> Kat  array
 *  icerdeki  array'lere  inner->Daire array denir
 * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
 *  Array'i ancak tum elemenlari atanarak declare edilmeli
 * 3- Multi dimensional array'de bir elemanin indexi icin
 *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir


 **************** ciktisini almak icin DeepToString yapmaliyiz *************
 */