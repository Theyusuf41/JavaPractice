package j27_Exceptions;

public class C03_ClassCastException {
    public static void main(String[] args) {
        // Birbirine convert edilemeyen data typelar donusturme isleminde olusan RTException
        Object obj = "Herkese selamlar";
        String str = (String) obj; // object data type String data type'a cevirildi
        System.out.println(str);


        Object sayi =33;
        //String str1 = (String) sayi;
        // System.out.println(str1); // Exception verdi
        try{
            String str1 = (String) sayi;
            System.out.println("Basari ile calisti (try)");
        }
        catch (ClassCastException e) {
            System.out.println("Basari ile calisti (catch)");
        }
        System.out.println("Basari ile calisti!!!");

        try{
            String str2 = (String) obj;System.out.println("Basari ile calisti (try)");
        }
        catch (ClassCastException e){
            System.out.println("Basari ile calisti (catch)");
        }
        System.out.println("Basari ile calisti???");
    }
}
