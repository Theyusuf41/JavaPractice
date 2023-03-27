package extraExercies.Hakan;

import java.util.Arrays;

public class JIQ_6 {
    public static void main(String[] args) {
        int [] arr = {10,9,8,7,3};
        sortedArr(arr);

    }

    private static void sortedArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
// Write a return method that can sort an int Array in Ascending order without using the sort method of Arrays class