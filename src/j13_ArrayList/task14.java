package j13_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        calcNumbersString();

    }

    private static void calcNumbersString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein String ein :");
        String str = input.nextLine();
        int sum =0;
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0; i<str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                int x = str.indexOf(i);
                sum+=x;
                nums.add(sum);
            }
        }
        System.out.println(nums);
    }
}
/*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
         verilen Stringde bulunan rakamların toplamını print eden parametreli METHOD create ediniz.
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */