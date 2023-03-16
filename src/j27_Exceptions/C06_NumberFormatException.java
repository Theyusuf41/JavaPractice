package j27_Exceptions;

public class C06_NumberFormatException {
    // numerik formatta olmayan bir value parseInt() meth call edilirse olusan RTE
    public static void main(String[] args) {
        String icardi = "1905";
        System.out.println(icardi);

        int wanda = Integer.parseInt(icardi);
        System.out.println(wanda + " wanda" );
        System.out.println(wanda + 1907);

        String id = "987654321l";
        //int invalidID = Integer.parseInt(id);
        //System.out.println(id);
        try{
            int invalidID = Integer.parseInt(id);
            System.out.println(id);
            System.out.println("Burayi okuyorsan hata gelmedi");
        }
        catch (NumberFormatException e) {
            id = "987654321";
            int newID = Integer.parseInt(id);
            System.out.println("Yeni id : " + newID);
            System.out.println("Bilader fazla zorluyorsun yok iste");
        }
        System.out.println("En son code calisti");
    }
}
