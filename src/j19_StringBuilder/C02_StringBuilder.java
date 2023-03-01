package j19_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        // StringBuilder Create etme

        // 1. Yol
        StringBuilder sb1 = new StringBuilder(); // default capacity 16
        System.out.println(sb1.length() + " lenght");
        System.out.println(sb1.capacity()+ " capacity");

        sb1.append("Yusuf"); // value eklendi
        System.out.println(sb1);
        System.out.println(sb1.capacity()+ " capacity");

        sb1.append("sdjasdjasjjd").append("dkadasjndasdkj").append("true");
        System.out.println(sb1);
        System.out.println(sb1.capacity()+ " capacity"); // capacity asiminda arttirir.



        // 2. Yol
        StringBuilder sb2 = new StringBuilder("Yusuf beye hizlica offer");
        System.out.println(sb2.length() + " lenght");
        System.out.println(sb2.capacity()+ " capacity");
        // initialize edilen StringBuilder ilk deger lenght'i capacity olarak atanir.

        // trimToSize() ile fazla capacity traslanir
        sb2.trimToSize();
        System.out.println(sb2.capacity());




    }
}
