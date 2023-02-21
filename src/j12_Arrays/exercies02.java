package j12_Arrays;

public class exercies02 {
    public static void main(String[] args) {
        int arr3[][]={
                {3,5},//0. kat
                {2,4,1},//1. kat
                {6,1,2,2},//2. kat
        };
        int multiple = 1;
        for(int i=0;i< arr3.length;i++){

                multiple*=arr3[i][arr3[i].length-1];

        }
        System.out.println(multiple);
    }
}
// task-> sayi arr'deki son elemanların çarpımını print eden code create ediniz