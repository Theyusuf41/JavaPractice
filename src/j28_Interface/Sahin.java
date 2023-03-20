package j28_Interface;

public class Sahin extends Tofask implements DisDonanim,IcDonanim,Lastik{
    @Override
    public void motor() {
        System.out.println("1.6 Tempra motoru taktik");
    }

    @Override
    public void yakit() {
        System.out.println("Düplü ve öfkeli");
    }

    @Override
    public void kapi() {
        System.out.println("4 kapi");
    }

    @Override
    public void koltuk() {
        System.out.println("4 koltuk");
    }

    @Override
    public void klima() {
        System.out.println("Yoktur");
    }

    @Override
    public void ebat() {
        System.out.println("Koca totolu teyze");
    }

    @Override
    public void jant() {
        System.out.println("Ates ediyo ates");
    }


}
