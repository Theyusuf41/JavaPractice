package j27_Exceptions;

public class C05_ArrayIndexOutOfBound {
    // Arraylerde olmayan index elemani ile islme yapildiginda olusan RTE
    public static void main(String[] args) {
        int sayi [] = {2,3,5,7};
         //System.out.println(sayi[5]);  ArrayIndexOutOfBound verir


        try {
            System.out.println(sayi[5]);
            System.out.println("Burayi okuyorsan hata gelmedi");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bilader fazla zorluyorsun yok iste out of Bounce" + e.getMessage());
        }
        System.out.println("En son code calisti");
    }
}
