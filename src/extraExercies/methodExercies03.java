package extraExercies;

import java.util.Scanner;

public class methodExercies03 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter a string: ");
        String src = input.nextLine();
        allWordCount(src);

    }

    public static void allWordCount(String a){
        System.out.println(a.replaceAll(" ", "").length());
    }
}
