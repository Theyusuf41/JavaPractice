package j28_Abstract.abstract01;

public abstract class Honda  { // Abstract parent class
    public abstract void motor(); // eger bu method butun childlarda zorunlu olsun istiyorsam abstract yapmaliyim ve body konulamaz
    public abstract void kapi(); // eger bu method butun childlarda zorunlu olsun istiyorsam abstract yapmaliyim ve body konulamaz
    public abstract void koltuk(); // eger bu method butun childlarda zorunlu olsun istiyorsam abstract yapmaliyim ve body konulamaz

    void sunroof(){ // concrete meth -> body'li olmasindan anlarsin. Istege bagli call
        System.out.println("Istersen ac sunroofu ");
    }

    // abs. classda variable tanimlanir mi?
    String isim = "Murat";
    String isim2 = "Ali";

    // final abs. method body'siz tanimlanamaz!!!
    // private abstract void method olamaz!!!
    // static void body'siz olamaz!!!
    // static abstract void method olamaz!!!
    //Honda h1 = new Honda();  abstract class'larda object uretilemez




}
