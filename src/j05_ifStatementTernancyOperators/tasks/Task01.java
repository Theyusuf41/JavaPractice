package j05_ifStatementTernancyOperators.tasks;
import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the range of age: ");

        int input1 = input.nextInt();
        if(input1>=0 && input1<=4){ // Bu kisma ve mantik operatoru eklenebilir //
            System.out.println("You are a baby");
        }else if(input1>=5 && input1<=12) {
            System.out.println("You are  between 5 and 12");
        }else if(input1>=13 && input1<=20) {
            System.out.println("Your age  between 13 and 20");
        }else if(input1>=21 && input1<=30) {
            System.out.println("Your age  between 21 and 30");
        }else{
            System.out.println("You typed invalid input");
        }



        /*
         Task->
         Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore print eden code create ediniz.
        0 - 4 => bebek
        5 - 12 => cocuk
        13 - 20 => genc
        21 - 30 => yetiskin
        Tanimlanmamis evre
         */

    }
}
