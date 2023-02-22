package j13_ArrayList;

import java.util.ArrayList;

public class task08 {
    public static void main(String[] args) {
        int [] numbers = {10,11,17,15,19,21,2};
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for(int i=0; i<numbers.length;i++) {
            if(numbers[i] %2 !=0) {
                oddNumbers.add(numbers[i]);
            }
        }
        System.out.println(oddNumbers);


    }
}
//Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.