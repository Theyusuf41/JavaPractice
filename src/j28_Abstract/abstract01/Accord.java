package j28_Abstract.abstract01;

public class Accord extends Honda{

    @Override
    public void motor() {
        System.out.println("2.0 motor hacminiz vardir.");
    }

    @Override
    public void kapi() {
        System.out.println("4 kapimiz vardir ve vakumlu falan");
    }

    @Override
    public void koltuk() {
        System.out.println("Deri kapli koltuklarimiz vardir");
    }

    @Override
    void sunroof() {
        super.sunroof();
    }
}
