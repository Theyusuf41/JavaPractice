import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        // Task 1 //
        Scanner input = new Scanner (System.in);
        System.out.println("Kac yasindasiniz? ");

        int intInput = input.nextInt();
        if (intInput>=40) {
            System.out.println("Kemal " + intInput +" yasindadir" );

        }
        // veya //
        String ternaryResult = (intInput >=40) ? "Kemal 40 yasindan büyüktür" : "Kemal 40 yasindan kücüktür";
        System.out.println(ternaryResult);

        // Task 2 //
        Scanner input2 = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");

        int intInput2 = input2.nextInt();
        if (intInput2>0) {
            System.out.println(intInput2 + " pozitiftir");
        }

        // veya //
        String ternaryResult2 = (intInput2>0) ? "Girilen sayi pozitif" : "Girilen sayi negatif";
        System.out.println(ternaryResult2);



        // Task 3 //
        Scanner input3 = new Scanner(System.in);
        System.out.println("Pozitif,negatif bir sayi giriniz:");

        int intInput3 = input3.nextInt();
        if(intInput3>0) {
            System.out.println("pozitif");
        }
        if(intInput3<0) {
            System.out.println("negatif");
        }
        if(intInput3==0) {
            System.out.println("birsey yapmayin :)");
        }
        // veya //
        Scanner inputt = new Scanner (System.in);
        System.out.println("Deger gir ulan");

        int newInputt = inputt.nextInt();
        String deger = (newInputt>0) ? ( newInputt==0 ? "sifirdir" : "pozitiftir" ) : "negatiftir";
        System.out.println(deger);



    }
}
