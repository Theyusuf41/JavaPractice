package j07_stringManipulation;

public class homework4 {
    public static void main(String[] args) {
        String str = "Ankara";
        String str2 = "Hamburg";

        if(str.length()%2 ==0) {
            int middle = str.length()/2;
            System.out.println(str.substring(0, middle) + str2 + str.substring(middle));
        }else
            System.out.println("Eklenemez!");

    }
}
/*
         Task->
         Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= Java
         name2= haluk
         Print ==> Jahalukva
         */