package extraExercies.Hakan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class JIQ_3 {
    public static void main(String[] args) {
        String str1 = "AAABBBCCCDEFFFFFFG";
        String str2 = "";
        //findUnique(str1 ,str2);
        // Another Method
        String nonDup = new LinkedHashSet<String>(Arrays.asList(str1.split(""))).toString(); // bu sekilde Array haline geliyor
        System.out.println(nonDup);

    }

    private static void findUnique(String str1, String str2) {
        for (int i = 0; i <str1.length() ; i++) {
            if(!str2.contains(str1.substring(i,i+1))){
                str2 += str1.substring(i , i+1);
            }
        }
        System.out.println(str2);
    }
}
// Write a return method that can fınd the unique characters from the String