package j20_Consructor;

public class C03_StudentRunner {
    public static void main(String[] args) {
        C03_Students student1 = new C03_Students(); // C03_Student classindan bir obj create ettik
        student1.name="yusuf";
        student1.lastName="karaoglu";
        student1.className="C";
        student1.gpa=60;
        student1.schoolNumber=601;
        student1.taktirBelgesi=true;

        System.out.println(student1);


        C03_Students student2 = new C03_Students();
        student2.name="ali";
        student2.lastName="karaoglu";
        student2.className="D";
        student2.gpa=85;
        student2.schoolNumber=610;
        student2.taktirBelgesi=true;

        System.out.println(student2);
    }
}
