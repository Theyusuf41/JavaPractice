package extraExercies.Hakan;

import java.util.Scanner;

public class JIQ_09 {
    public static void main(String[] args) {
        twoThreeFive();

    }

    private static void twoThreeFive() {
        int countdown = 1;

        while(countdown<31){
            if(countdown%30==0){
                System.out.println("CodilityTestCoders");
            }else if(countdown%3==0){
                System.out.println("Test");
            }else if(countdown%2==0){
                System.out.println("Codility");
            }else System.out.println(countdown);
            countdown++;
        }

    }
}
// 2 bolunuyorsa "Codility" ; 3 bolunuyorsa "Test" ; 5 bolunuyorsa "Coders" ; hepsine ise concat et