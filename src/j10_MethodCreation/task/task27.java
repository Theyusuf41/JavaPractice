package j10_MethodCreation.task;

import java.util.Scanner;

public class task27 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ballCalc();
        
    }

    private static void ballCalc() {
        System.out.println("Bitte geben Sie die Höhe :");
        int firstHeight = input.nextInt();
        int count = 0;
        double bounceHeight = 0;

        while(true) {
            if(firstHeight!=1) {
                bounceHeight = ((firstHeight* 3.4));                count++;
                System.out.println("Ingesamt bounce ist: " + count + "\n die gesamte height :" + bounceHeight);

            }else if (firstHeight==1 ) {
                System.out.println("1den daha az oldu !!");
            }
            break;
        }
    }
}
/*
   task->
   belirli bir yukseklikten bırakılan top atildigi yuksekligin 3/4 u kadar yerden yukari dogru ziplamaktadir
    Topun ziplama  yuksekligi 1 metrenin altina dşütüğü ana kadar topun aldigi toplam yolu ve yere vurma sayisini print eden METHOD  create ediniz.
*/