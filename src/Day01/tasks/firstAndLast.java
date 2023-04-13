package Day01.tasks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class firstAndLast {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("merhaba"));
        Scanner input = new Scanner((System.in));
        System.out.println("Kelime giriniz:");
        String value = input.nextLine();
        System.out.println("Kelime giriniz:");
        int num = input.nextInt();
        degisim(value,num);
        listDegisim(l1,num);

    }

    private static void listDegisim(List<String> l1, int num) {
       // l1.stream().filter(t-> Boolean.parseBoolean(t.substring(0,1)+ t.substring(t.length()-1))).mapToInt(t-> (int)(t*t*t))
       // l1.stream().forEach(t-> System.out.println(t.substring(0,1)+t.substring(t.length()-1))); //
    }

    public static void degisim(String value, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(value.substring(0,1)+ value.substring(value.length()-1));
        }
    }
}
// Kullanicidan alinan son ve ilk harfleri verile sayi kadar return ediniz: