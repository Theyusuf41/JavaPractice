package j22_Encapsulation.encapsulation01.task02;

public class Task02 {
    private String name;
    private int age;



    public Task02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student name is " + getName() +"\n" + "You are " + getAge()+ " years old";
    }
}
    /*Runner ve Student classları create ediniz
    Student classı içinde;
        String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz

        Runner classın içinde;
        girilen değerleri aşagıdaki gibi print eden code create ediniz
        Örnek:
        age 48'dir.
        name Haluk'tur.

        name(isim) olarak;
        "Student name is Haluk"
        ve
        age(yaş) olarak da;
        "He is 48 years old" */