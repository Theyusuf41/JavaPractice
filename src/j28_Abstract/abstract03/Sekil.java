package j28_Abstract.abstract03;

public abstract class Sekil {
    String name;
    public abstract double alan();
    public abstract double cevre();

    public void ciz(){
        System.out.println(this.name + " cizildi");
    }

    @Override
    public String toString() {
        return "name='" + name + "\n Alan= " + this.alan()  + "\n Cevre= " + this.cevre();
    }
}
