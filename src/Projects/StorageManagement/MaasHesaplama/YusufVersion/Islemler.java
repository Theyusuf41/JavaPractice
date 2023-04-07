package Projects.StorageManagement.MaasHesaplama.YusufVersion;

import depoYonetimiYusuf.Urunler;

import java.util.HashMap;
import java.util.Scanner;

public class Islemler {
    static Scanner scan = new Scanner(System.in);
    static int id=100;
    static HashMap<Integer , Calisan> cls = new HashMap<>();

    public static void calisanTanimla(){
        System.out.print("calisan adi ");
        String name = scan.nextLine();
        System.out.print("maasi nedir: ");
        int salary = scan.nextInt();
        System.out.print("calisma saatleri: ");
        int workHours = scan.nextInt();
        System.out.print("ahngi yilda basladi ");
        int year = scan.nextInt();
        scan.nextLine();

        Calisan calisanlar = new Calisan(name,salary,workHours,year);
        cls.put(id,calisanlar);
        cls.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
       // System.out.println("Yeni eklenen kisi: " + calisanlar.getName() +  cls.keySet());
        id++;
    }
    public static void vergiHesaplama(){
       // cls.entrySet().stream().filter(t-> t.get())
        if(cls.get(100).getSalary()>1000){
            System.out.println("Odemeniz gereken vergi miktari :" + cls.get(100).getSalary() * 0.3);
        }else System.out.println("Para kaciyor devletten!");
    }



}
