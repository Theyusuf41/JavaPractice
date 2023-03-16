package j27_Exceptions;


import java.util.Scanner;

public class C07_IllegalArgumentException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("yas ulan ulan");
        int yas = scanner.nextInt();

        try{
            if(yas<18) {
                throw new IllegalArgumentException("yore git bebe");
            }else System.out.println("olur alirsin ");
            System.out.println("Exception firlatmadi ");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("gucuksun daha gardes");
            System.out.println("Exception firlatti hallettik");
        }
        System.out.println("Kod basari ile run oldu");
    }
}
/*
ahan da TRİCK kosesinde bugun :)

"throw" - throws" farkları
1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
   "throw" -> method body içinde tanımlanır.
2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
   "throw" -> keywordden sonra sadece bir tane exception tanımlanır
3- "throws" -> keywordden sonra sadece exception class name yazılır
    "throw" ->  keywordden sonra exception obj tanımlanır
4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
    "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
 */


// IllegalargumentException -> kullanılmasını istenmeyen değerlerde pr hata vermesi isteniyorsa bu excp fırlatılıer
// ornek : yas datası için negatif değer girilidğinde pr kırılmadan run olması ama girile değer için excp fırlatması için kullanılır..