package Day01;

import java.util.Scanner;

public class Q05_CertainCharacterCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("cumle gir");
        var str1 = input.nextLine();
        System.out.println("harf gir");
        var str2 = input.next().charAt(0); // char
        var count = 0;
        /*for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == str2 ){
                count++;
            }
        }*/
        System.out.println(count);


        lambdaSolution(str1,str2);
    }

    public static void lambdaSolution(String str1, char str2) {
        System.out.println(str1.chars().filter(t -> t == str2).count()); //
    }


}
// Kullanicidan bir cumle ve harf alin. Cumlede harf kac kere kullanildi bunu output olarak verin