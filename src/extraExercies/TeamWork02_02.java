package extraExercies;

import java.util.Arrays;

public class TeamWork02_02 {
    public static void main(String[] args) {
        String [] arr1 = {"Peach","Berry", "Orange" ,"WaterMelon", "Orange" };

        returnApple(arr1);

    }

    private static void returnApple(String[] arr1) {
        for (int i = 0; i < arr1.length ; i++) {
            if(arr1[i]=="Orange"){
                arr1[i]="Apple";
            }
        }
        System.out.println(Arrays.toString(arr1));
        /*for (String str :arr1) {
            if(str.equals("Orange")){
                str="Apple";
                System.out.println(Arrays.toString(arr1));
            }
        }*/

    }
}
/*
        Given one arrays of Strings
        If string contains Orange change all Orange to Apple

        For Example:
        Array : Peach , Berry , Orange , WaterMelon , Orange

        Result should be Peach , Berry , Apple , WaterMelon , Apple

        Print the Array

     */


    /*
       String bir array verildiğinde

       Eger String Orange içeriyorsa bütün  Orange leri Apple  çevirip arrayı print eden code create ediniz.

       Örnek:

       Array : Peach , Berry , Orange , WaterMelon , Orange

       Result  : Peach , Berry , Apple , WaterMelon , Apple

     */