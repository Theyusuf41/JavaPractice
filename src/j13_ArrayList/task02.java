package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        // Bu task'in tricki ArrayListlerin boyutunun sinirsiz olmasi nedeniyle String bir deger kullanarak loop'u durdurmamiz.
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Sayi atamak icin dikla \n yeter diyorsan ' q ' dikla");
        String sumString="";
        int sumInt=0;

        while(!sumString.equalsIgnoreCase("q")){
            System.out.println("Sayi gir ulan");
            sumString = input.nextLine();
            list.add(sumString);
        }
        list.remove(list.size()-1); // bu sayede 'q' kurtuluruz ve elemanlarin karelerini almaya hazir oluruz.

        for(int i=0; i<list.size();i++) {
            sumInt+= Integer.parseInt(list.get(i)) * Integer.parseInt(list.get(i));

        }
        System.out.println(sumInt);

    }
}
// Bir Integer list olusturup her elemanin karesini alin!