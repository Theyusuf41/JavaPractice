package j20_Consructor;

public class C03_Students {
    String name;
    String lastName;
    String className;
    int gpa;
    int schoolNumber;
    boolean taktirBelgesi;



    /*public static void main(String[] args) {
        C03_Students obj1 = new C03_Students();
        obj1.name="yusuf";
        obj1.lastName="karaoglu";
        obj1.className="C";
        obj1.gpa=60;
        obj1.schoolNumber=601;
        obj1.taktirBelgesi=true;
        graduation(obj1.gpa);
        System.out.println(obj1);


        C03_Students obj2 = new C03_Students();
        obj2.name="ali";
        obj2.lastName="karaoglu";
        obj2.className="D";
        obj2.gpa=85;
        obj2.schoolNumber=610;
        obj2.taktirBelgesi=true;
        graduation(obj2.gpa);
        System.out.println(obj2);


    } */

    private static void graduation(int gpa) {
        System.out.println((gpa >= 50) ? " Mezun oldun " : " Olamadin sorry! ");
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", className='" + className + '\'' +
                ", gpa=" + gpa +
                ", schoolNumber=" + schoolNumber +
                ", taktirBelgesi=" + taktirBelgesi;
    }
}
/*
Task-> fields: ad, soyad, sınıf, ortalama, okulNo, takdirBelgesi olan 2 farklı obj ile
mezuniyet(ortalama 50 üstü ise mezun oldunuz) sosyalFaaliyet methodlarını  print eden code create ediniz.
 */