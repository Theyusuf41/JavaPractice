package j12_Arrays;

public class C07_DimensionArray {
    public static void main(String[] args) {
        int arr3[][]={
               {3,5},//0. kat
               {12,13,15},//1. kat
                {103,107,111,121},//2. kat
        };
        int sum = 0;
        for(int i=0;i< arr3.length;i++){
            for(int j=0; j<arr3[i].length; j++){
                sum+=arr3[i][j];
            }
        }
        System.out.println(sum);

    }
}

// ********************** Her boyut icin ayri for acmak gerekir ********************************* //



//Task-> int arr3[][]={
//                {3,5},//0. kat
//                {12,13,15},//1. kat
//                {103,107,111,121},//2. kat
//        }; array elamanları toplamını print eden code create ediniz