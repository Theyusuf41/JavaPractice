package j12_Arrays;

import java.util.Arrays;

public class task15 {
    public static void main(String[] args) {
        String arr [] = {"Removes white space from both ends of a string"};


        for(int i=0; i<arr.length;i++) {
            String str = Arrays.toString(arr);
            if(arr[i] == "\\W"){
                str.replaceAll("\\W", "");
                System.out.println(str);
            }else if(arr[i] == " "){
                str.replaceAll(" ", "");
                System.out.println(str);
            }

        }




    }
}
   /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */