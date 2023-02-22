package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class task21 {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 3,2,1 };
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        for(int i=0; i< arr1.length/2;i++) {
            num1.add(arr1[i]);
        }
        System.out.println(num1);
        for(int i=arr1.length/2; i< arr1.length;i++) {
            num2.add(arr1[i]);
        }
        Collections.sort(num2);
        if(num1.equals(num2)){
            System.out.println("verilen array simetriktir");
        }else System.out.println("verilen array simetriktir degildir");
    }
}
/* TASK :
		ayna check sorusu: verilen Arrayın Ayna array olmasını kontrol eden code create ediniz
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */