package Projects.StorageManagement.PizzaSiparis;

public class Pizza { // pizza obj ureten concrete class
    private double fiyat;
    private PizzaSekil pSekil;

    public Pizza(double fiyat, PizzaSekil pSekil) {
        this.fiyat = fiyat;
        this.pSekil = pSekil;
    }

    public double getFiyat() {
        return fiyat;
    }

    @Override
    public String toString() {
        return "Pizza fiyati " + fiyat +
                " pizzanin sekli " + pSekil;
    }
}
