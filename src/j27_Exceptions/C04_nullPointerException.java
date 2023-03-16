package j27_Exceptions;

public class C04_nullPointerException {
    //null atamasi yapilan bir String variable length() method call edildiginde olusan RTE
    public static void main(String[] args) {
        String str1 ="";
        String str2 =null;
        System.out.println(str1.length());
        //System.out.println(str2.length()); // RTE : NullPointerException verir
        try {
            System.out.println(str2.length());
            System.out.println("Bilader bu satir okunduysa code Exception firlatmadi.");
        }
        catch (NullPointerException e) {
            System.out.println("Bilader kodun anasi agladi");
        }
        System.out.println("Kodun finished bro");


    }
}
