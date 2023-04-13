package j19_StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {
    public static void main(String[] args) {
        // Host IP adres Password String guvenlik
        // String a = "asdasd";
        // StringBuilder StringBuffer
        // thread-safe
        // String name and Password yeni const StringBuilder -> conflict
        // StringBUffer thread-safe

        String name = "";
        name+="QA tester";
        name+="Ali bey"; // String variable cok fazla method call icin performansi zayiftir.
         /*
         Eğer çok fazla String işlemleri yapacaksak bunun için performansı oldukça iyi olan StringBuilder kullanılır.
        yapısı gereği hızlı çalışır.Fakat paralel çalışan uygulamalarda güvenli değildir.O zaman StringBuffer kullanılır.
        StringBuilder; Dolmus söföru gibi geleni aliyor
        StringBuffer de TAKSİ ler gibi çalışır
         */
        System.out.println("method oncesi name "+name);
        strBirlestir(name);
        System.out.println("method sonrasi name "+name);

        // task 3333 tekrarli bir loop olustur String ve StringBuilder ile sonrasinda run time'lari karsilastir.
        String str = "";
        StringBuilder sb = new StringBuilder("");
        LocalTime strBaslangic = LocalTime.now();
        for (int i = 1; i <3333 ; i++) { // String kod
            str+=i;
        }
        LocalTime strSon = LocalTime.now();
        System.out.println(strBaslangic.getNano() - strSon.getNano()) ;
        System.out.println("**** **** ****") ;
        LocalTime sbBaslangic = LocalTime.now();
        for (int i = 1; i <3333 ; i++) { // StringBuilder kod
            sb.append(i);
        }
        LocalTime sbBitis = LocalTime.now();
        System.out.println(sbBitis.getNano() - sbBaslangic.getNano()) ;




    }

    private static void strBirlestir(String name) {
        System.out.println("method call calisti");
    }
}
/*
   String = > daha yavas ,Immutable==> degismez,
   String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

   1) Java pass-by-value kullanir.dublor
   2) String Class'i immutable Class'dir.değişmez

    StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
    StringBuffer synchronized,thread safe.

   StringBuilders = mutable==>degisebilir ,
   not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

   1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
   StringBuilder isimli bir class uretmistir.
   2) Java'da StringBuilder ile hemen hemen ayni isi yapan bir de StringBuffer classi vardir.
   "StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
   "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
   "StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
   3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
  	Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.

				 */