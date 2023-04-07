package Projects.StorageManagement.PizzaSiparis;

public class DikdortgenPizza extends PizzaSekil{ // concrete child class

    private double en;
    private double boy;

    public DikdortgenPizza(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }

    @Override
    public double pizzaAlanHesapla() {
        return 0;
    }
}
