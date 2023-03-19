package j28_Abstract.abstract03;

public class Cember extends Sekil{
    double yarucap;
    final double pi=3.14;



    @Override
    public double alan() {
        return (2*pi*yarucap);
    }

    @Override
    public double cevre() {
        return (2*pi*(yarucap*yarucap));
    }
}
