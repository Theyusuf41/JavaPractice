package extraExercies.Hakan;

import java.util.Arrays;
import java.util.TreeSet;

public class JIQ_02 {
    public static void main(String[] args) {
        String str1 = "abccccc";
        String str2 = "cbaaaaaaaaaaa";
        String str3 = "abc";
        String str4 = "abb";

        System.out.println(isSame(str1, str2));
        System.out.println(isSame(str3, str4));
        same3(str1, str2);


    }

    public static String isSame(String str1, String str2) {
        char [] stringA = str1.toCharArray();
        char [] stringB = str2.toCharArray();
        Arrays.sort(stringA);
        Arrays.sort(stringB);
        if(Arrays.equals(stringA,stringB)){
            return "true";
        }else return "false";
    }

    // TreeSet
    public static void same3(String str1, String str2) {
        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        System.out.println(str1.equals(str2));
    }

}
