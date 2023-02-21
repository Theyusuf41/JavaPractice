package j12_Arrays;

import java.util.Arrays;

public class task17 {
    public static void main(String[] args) {
        int[][] arr = { {2,3,2} , {4,1,5} , {4,1,5} , {7,2,5} };
        System.out.println(Arrays.deepToString(arr));

        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j] ==2) {
                    arr[i][j] =6;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr) + " *************");


    }
}
/*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
*/