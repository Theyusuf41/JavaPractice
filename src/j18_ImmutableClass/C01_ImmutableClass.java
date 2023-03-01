package j18_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        String str1 = "Yusuf";
        String str2 = "Yusuf";// str1 ve str2 ilk deger atamalari yapildi ve ortak String pool olusturuldu.

        String str3 = new String("Yusuf"); // (new yaziyorsak obje olur) ilk deger atamasi yapilmis String obj -> heat memory ref farkli;
        String str4 = new String("Yusuf"); // (new yaziyorsak obje olur) ilk deger atamasi yapilmis String obj -> heat memory ref farkli;

        String str5 = str1+"";

        System.out.println(str1 == str2 );
        System.out.println(str1 == str3 + "str1 == str3");
        System.out.println(str1.equals(str2) + "str1.equals(str2)");
        System.out.println(str3 == str4 + "str3 == str4");
        System.out.println(str1 == str5 + "str1 == str5");
        System.out.println(str1.equals(str5) + "str1.equals(str5)");

        // == ile hem referans degeri hem de kendisine bakar ancak equals ile sadece icerige bakar ve gecer.
    }
}
