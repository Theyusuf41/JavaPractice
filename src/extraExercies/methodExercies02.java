package extraExercies;

import java.util.Scanner;

public class methodExercies02 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter a text: ");
        String str = input.nextLine();
        middle(str);
    }
    public static void middle(String a) {
        int middleIndex = a.length()/2;
        if(a.length()%2==0) {
            System.out.println(a.charAt(middleIndex));
        }else  if(a.length()%2!=0){
            System.out.println(a.charAt(middleIndex));
        }

    }
}
