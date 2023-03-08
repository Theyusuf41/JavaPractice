package j13_ArrayList.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task05 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList( "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));

        rotateList(cities);

    }

    private static void rotateList(ArrayList<String> cities) {
        /*for(int i= cities.size()-1; i>0; i--){
            System.out.print(cities.get(i));
        } */
        Collections.reverse(cities);
        System.out.println(cities);
    }
}
 /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */