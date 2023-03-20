package extraExercies;

import java.util.Arrays;
import java.util.Collections;

public class JIQ_5 {
    public static void main(String[] args) {
        int [] arr = {5,6,7,2,1,9,3,99};

        findMax(arr);

    }

    private static void findMax(int[] arr) {
        /*Arrays.sort(arr);
        int a = arr[arr.length-1];
        System.out.println(a); */
        int value = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] >  value){
                value = arr[i];
            }
        }
        System.out.println(value);

    }
}
// Write a method that can find the maximum number from an int Array