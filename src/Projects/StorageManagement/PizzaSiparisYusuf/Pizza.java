package Projects.StorageManagement.PizzaSiparisYusuf;

public class Pizza {//pojo class
    int pizzaprice;
    int pizzasize;
    boolean Sausage;
    boolean chicken;
    boolean meet;
    boolean veg;

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaprice=" + pizzaprice +
                ", pizzasize=" + pizzasize +
                ", Sausage=" + Sausage +
                ", chicken=" + chicken +
                ", meet=" + meet +
                ", veg=" + veg +
                ", mix=" + mix +
                '}';
    }

    public Pizza(int pizzaprice, int pizzasize, boolean sausage, boolean chicken, boolean meet, boolean veg, boolean mix) {
        this.pizzaprice = pizzaprice;
        this.pizzasize = pizzasize;
        this.Sausage = sausage;
        this.chicken = chicken;
        this.meet = meet;
        this.veg = veg;
        this.mix = mix;
    }

    boolean mix;

    public int getPizzaprice() {
        return pizzaprice;
    }

    public void setPizzaprice(int pizzaprice) {
        this.pizzaprice = pizzaprice;
    }

    public int getPizzasize() {
        return pizzasize;
    }

    public void setPizzasize(int pizzasize) {
        this.pizzasize = Math.abs(pizzasize);
    }

    public boolean isSausage() {
        return Sausage;
    }

    public void setSausage(boolean sausage) {
        Sausage = sausage;
    }

    public boolean isChicken() {
        return chicken;
    }

    public void setChicken(boolean chicken) {
        this.chicken = chicken;
    }

    public boolean isMeet() {
        return meet;
    }

    public void setMeet(boolean meet) {
        this.meet = meet;
    }

    public boolean isVeg() {
        return veg;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }

    public boolean isMix() {
        return mix;
    }

    public void setMix(boolean mix) {
        this.mix = mix;
    }

}