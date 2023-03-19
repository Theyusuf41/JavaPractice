package PizzaSiparis;

public class DairePizza extends PizzaSekil{ // concrete child class
    // dairePizza obj ureten class
    final double pi=3.14;
    private double yariCap;


    @Override
    public double pizzaAlanHesapla() { // implement edilen concrete meth
        return pi*yariCap*yariCap;
    }

    public DairePizza(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public String toString() {
        return "Dairesel pizzanin yaricapi:" + yariCap + " , buyuklugu " + pizzaAlanHesapla();
    }
}
