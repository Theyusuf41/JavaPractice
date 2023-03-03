package j20_Consructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {

        C04_Teacher ogrtm1 = new C04_Teacher();
        ogrtm1.ad="yusuf";
        ogrtm1.soyad="karaoglu";
        ogrtm1.brans="cografya";
        ogrtm1.id=41;
        ogrtm1.maas=4000;
        ogrtm1.tecrube=2;
        ogrtm1.emekli=false;
        System.out.println(ogrtm1);


        C04_Teacher ogrtm2 = new C04_Teacher("bahtiyar", "ariza", "kimya", 30,10,5000,true);
        System.out.println(ogrtm2);
    }
}
