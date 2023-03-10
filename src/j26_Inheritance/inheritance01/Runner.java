package j26_Inheritance.inheritance01;

public class Runner {
    public static void main(String[] args) {
        Hayvancik h1= new Hayvancik();
        h1.hareket();
        h1.beslenme();
        h1.su();

        Memeli m1 = new Memeli();
        m1.dogurma();
        m1.sutBeslen();

        Balik b1 = new Balik();
        b1.izgara();

        Kedi k1 = new Kedi();
        k1.mir();
        k1.sutBeslen();



    }
}
/*
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları içim kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/