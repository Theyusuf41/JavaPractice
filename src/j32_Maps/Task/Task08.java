package j32_Maps.Task;

import java.util.HashMap;
import java.util.Scanner;

public class Task08 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "New York");
        hm.put(2, "London");
        hm.put(3, "Hamburg");
        hm.put(4, "Istanbul");
        System.out.println(hm);

        update(hm);

    }

    private static void update(HashMap<Integer, String> hm) {
        System.out.println("Bir sayi giriniz");
        int keyNum = scan.nextInt();
        System.out.println("Bir sehir giriniz");
        String valueCity = scan.next();
        scan.nextLine();
        if(hm.containsKey(keyNum)){
            hm.put(keyNum,valueCity);
        }
        System.out.println(hm);
    }
}
// Parametreleri : <Integer, String> HashMap , int ve String olan update isimli method create ediniz.
// Girilen int degeri key , String ise value olarak kabul edilip olan bir HashMap'i guncellemeli ->
// 1 , "New York" 2, "London" gibi bir HashMap