package j12_Arrays;

public class exercies03 {
    public static void main(String[] args) {
        int arr3[][]={
                {3,5},//0. kat
                {2,4,1},//1. kat
                {6,1,2,2},//2. kat
        };
        int multiple = 0;
        for(int i=0;i< arr3.length;i++){
            for(int j=0; j<arr3[i].length; j++){
                if(arr3[i][j]>multiple){
                    multiple= arr3[i][j];
                }
            }
        }
        System.out.println(multiple);
    }
}
//task-> sayi arr'deki en buyuk elemanı print eden code create ediniz...