package j12_Arrays;

import java.util.Arrays;

public class task20 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4};
        int arr2 [] = new int[2];
        for(int i=0;i< arr.length;i++) {
            if(arr[0]==i || arr.length==i){
                arr2[2] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
/*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */