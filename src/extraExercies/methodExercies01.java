package extraExercies;


import java.util.Scanner;

public class methodExercies01 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int top =0;


        for(int i=0; i<3; i++) {
            System.out.println("Please enter three number : ");
            int num = input.nextInt();
            top+=num;
        }
        averageCal(top);
    }

    public static void averageCal(int a) {
        System.out.println(a/3);
    }
}
