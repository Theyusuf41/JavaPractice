package j26_Inheritance.inheritance01.task;

public class SubClass extends SuperClass{
    static int sayi = 17;

    public SubClass() {
    }

    public SubClass(int sayi, int sayi1) {
        super(sayi);
        this.sayi = sayi1;
    }

    @Override
    public String ebikGabik() {
        return "Subclass'tan selamlar";
    }
}
