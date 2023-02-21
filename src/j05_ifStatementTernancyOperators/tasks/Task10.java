package j05_ifStatementTernancyOperators.tasks;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihr Note ein: ");
        int noteInput = input.nextInt();

        if(noteInput<=50 && noteInput>0) {
            System.out.println("Ihr Note ist D");
        }else if(noteInput>=50 && noteInput<=60) {
            System.out.println("Ihr Note ist C");
        }else if(noteInput>=60 && noteInput<=80) {
            System.out.println("Ihr Note ist B");
        }else if(noteInput>=80 && noteInput<=100) {
            System.out.println("Ihr Note ist A");
        }else if (noteInput<=0 && noteInput>100){
            System.out.println("Ungultige Note wurde eingegeben");
        }


        /* Task->
         Kullanicidan 100 uzerinden notunu isteyin.
         Not’u harf sistemine cevirip yazdirin.
         50’den kucukse “D”,->1,2,3..49
         =50  <60 arasi “C”,->50,51,52,..59
         =60  <80 arasi “B”,->60,61,62,63..79
         =80’nin uzerinde ise “A”->80,81..100
         */









    }


}
