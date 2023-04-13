package AccessModifier.test;

import AccessModifier.CalisanBilgi;

public class TestMain extends CalisanBilgi {
    public TestMain(String name, int id, String occupation) {
        super(name, id, occupation);
    }

    public static void main(String[] args) {
       // CalisanBilgi c1 = new CalisanBilgi("Emine", 100, "QA Test EWngineer");
        TestMain t1 = new TestMain("Emine", 100, "QA Test EWngineer");
        t1.occupation = "Team Lead";
        System.out.println(t1);


    }
}
