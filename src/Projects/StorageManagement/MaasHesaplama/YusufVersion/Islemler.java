package Projects.StorageManagement.MaasHesaplama.YusufVersion;

import depoYonetimiYusuf.Urunler;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Islemler {
    static LocalDate today = LocalDate.now();
    static Scanner scan = new Scanner(System.in);
    static int id=100;
    static HashMap<Integer , Calisan> cls = new HashMap<>();



    public static void calisanTanimla(){
        System.out.print("calisan adi ");
        String name = scan.next();
        scan.nextLine();
        System.out.print("maasi nedir: ");
        int salary = scan.nextInt();
        System.out.print("calisma saatleri: ");
        int workHours = scan.nextInt();
        System.out.print("Hangi yilda basladi ");
        int year = scan.nextInt();
        //System.out.print("title nedir ? ");
        //String kademeFalan = scan.nextLine();
        //Title.valueOf(kademeFalan)




        Calisan calisanlar = new Calisan(name,salary,workHours,year);
        cls.put(id,calisanlar);
        //cls.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
        System.out.println("Yeni eklenen kisi: " + calisanlar.getName() +  cls.keySet());
        id++;
        SwitchIslemleri.SwitchIslemleri();
    }
    public static void vergiHesaplama(){
        System.out.println("Hesaplanacak kisinin id degerini giriniz:");
        int id = scan.nextInt();
       // cls.entrySet().stream().filter(t-> t.get())
        if(cls.get(id).getSalary()>10000){
            System.out.println("Odemeniz gereken vergi miktari :" + cls.get(id).getSalary() * 0.3);
        }else System.out.println("Maasiniz belli bir degerden az oldugu icin odeme yok");
        SwitchIslemleri.SwitchIslemleri();

    }
    public static void bonusHesapla() {
        System.out.println("Hesaplanacak kisinin id degerini giriniz:");
        int id = scan.nextInt();
        int extraMoney = 50;
        if(cls.get(id).getWorkHours()>40) {
            System.out.println("Alacaginiz ekstra para: " +(cls.get(id).getWorkHours() - 40) * extraMoney);
        }else System.out.println("40 saatten sonrasina ekstra alinir seker");
        SwitchIslemleri.SwitchIslemleri();

    }
    public static void maasArtisi(){
        System.out.println("Hesaplanacak kisinin id degerini giriniz:");
        int id = scan.nextInt();
        int yearCal = (cls.get(id).getYear())- today.getYear();
        //double artisMiktari = 0;
        if(yearCal<5) { // TODO : Burada Logic gelistirmesi yapmak lazim
            System.out.println((cls.get(id).getSalary()) * 0.5);
        }else if(yearCal>5 && yearCal<15) {
            System.out.println((cls.get(id).getSalary()) * 0.1);
        }else
            System.out.println((cls.get(id).getSalary()) * 0.2);
        SwitchIslemleri.SwitchIslemleri();
    }

    public static void listele() {
        cls.entrySet().stream().forEach(t-> System.out.println(t.getKey() + " " + t.getValue()));
        SwitchIslemleri.SwitchIslemleri();
    }



}
