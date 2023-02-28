package j15_Varargs;

public class Task04 {
    public static void main(String[] args) {
        String strArr[] = {"yusuf"};
        String strArr2[] = {"ali" };
        int number = 2;
        yusufMethod(number,strArr);
        yusufMethod(number,strArr2);

    }

    private static void yusufMethod(int number, String...str) {
        String empty="";
        for (String w:str ) {
            empty+=w.substring(0,number);
        }
        System.out.println(empty);
    }
}
// Stringlerin istenilen kadar ilk harflerini yazdiran code create ediniz.