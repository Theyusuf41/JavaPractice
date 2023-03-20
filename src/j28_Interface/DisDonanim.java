package j28_Interface;

public interface DisDonanim {

    void kapi(); // public abstract method
    String renk="bej"; // default olarak finaldir
    public static String sisLamp(){ // Bu kismi kacirdim sor!!
        return "Hava sisli";
    }
    public default void anten() { //
        System.out.println("Anten anten konusma");
    }

}
