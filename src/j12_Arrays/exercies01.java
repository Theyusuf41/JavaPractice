package j12_Arrays;

public class exercies01 {
    public static void main(String[] args) {
        int arr3[][]={
                {3,5},//0. kat
                {2,4,1},//1. kat
                {6,1,2,2},//2. kat
        };
        int multiple = 1;
        for(int i=0;i< arr3.length;i++){
            for(int j=0; j<arr3[i].length; j++){
                multiple*=arr3[i][j];
            }
        }
        System.out.println(multiple);
    }
}
