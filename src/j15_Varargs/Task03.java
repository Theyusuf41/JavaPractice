package j15_Varargs;

public class Task03 {
    public static void main(String[] args) {
        int number = 7;
        String str1="sefil javaci Yusuf";
        String str2="perfect javaci Yusuf";
        String str3="belesci muhtar Yusuf K.";
        System.out.println(calcLong(number, str1, str2, str3));


    }

    private static int calcLong(int number, String...str) {
        String lenghtOfString ="";
        for (String x:str) {
            if(x.length()>lenghtOfString.length()){
                lenghtOfString+=x;
            }
        }
        return number*lenghtOfString.length();

    }
}
// girilen bir sayi ile girilen String'lerin en uzun harf sayisini carpan Method create ediniz.