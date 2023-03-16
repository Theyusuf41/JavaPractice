package j28_Abstract.abstract01;

public class Crv extends Honda{
    @Override
    public void motor() {
        System.out.println("2.4 motor hacminiz vardir.");
    }

    @Override
    public void kapi() {
        System.out.println("4 kapimiz vardir ve kaliteli falan");
    }

    @Override
    public void koltuk() {
        System.out.println("Guzel  koltuklarimiz vardir");
    }

    @Override
    void sunroof() {
        super.sunroof();
    }
}
