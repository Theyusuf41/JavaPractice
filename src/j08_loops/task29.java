package j08_loops;


import java.util.Scanner;

public class task29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a text : ");
        String str = input.nextLine();


        for(int i=0; i<str.length(); i++) {
               if(i %2 ==0 ) {
                   System.out.print(Character.toUpperCase(str.charAt(i)));
               }
            }






        /*for(int i=1; i<str.length(); i++) {
            if(str.charAt(i)%2!=0) {
                System.out.println();


                 if(indexNumber%2 !=0) {
            for(int i=1; i<str.length(); i+=2) {
                System.out.println(str.charAt(i));
            }
            }
        }*/
    }
}
// task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
// index'i cift sayi olanlari buyuk harfle print eden code create ediniz
// ornek : Java  output: JaVa