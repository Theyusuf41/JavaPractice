package j15_Varargs;


public class C01_Varargs {
    public static void main(String[] args) {
        int a= 20;
        int b= 30;
        int c= 50;
        int d= 10;
        int e= 5;
        int f= 90;

        sum(a,b);
        sum(b,c);
        sum(d,a);
        sum(f,b);
        sum(c,b);
        sum(e,b);
        sum(f,b);

        sumVarargs(a,b,d,20);

        // Verilen String value'larin en cok karaktere sahip olanini bulan method create ediniz!
        findLenght("abcderf", "javacan", "javatar", "javaustat", "kelimeavcisi");
        findLenght("ali", "veli", "abdullah", "kemallettin", "hüsrev");
        findLenght("cat", "dog", "donkey", "monkey", "elefant");



    }

    private static void findLenght(String...str) {
        String emptyStr= "";
        for (String x: str) {
            if(x.length()>emptyStr.length()) {
                emptyStr=x;
            }
        }
        System.out.println("en uzun String "+ emptyStr);
    }

    private static void sumVarargs(int...x) {
        int topla=0;
        for (int q: x) {
            topla+=q;

        }
        System.out.println(topla);
    }

    private static void sum(int num1,int num2){
        System.out.println("toplam " + (num1+num2));
    }
}
// Varargs'lar .ok fazla kullanilmaz. Bilmenin faydali oldugu seylerden birisidir. Method yapilirken kullanilir ve bir method'da sadece bir tane Vararg olabilir ve en sonda olmak zorundadir.
// method(parametre1, parametre2, datatype ...dataName) seklinde tanimlanir.
// Varagslar return degeri olarak Array doner. Bu nedenle degerlerin ciktisini almak icin loop acmak gerekir.