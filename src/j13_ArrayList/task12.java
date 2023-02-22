package j13_ArrayList;

import java.util.ArrayList;

public class task12 {
    public static void main(String[] args) {
        int [] numbers = {2,6,4,5,8,9};
        ArrayList<Integer> squareOfNumbers = new ArrayList<>();
        int x =0;
        for(int i=0; i< numbers.length; i++) {
            x+=numbers[i]*numbers[i];
            squareOfNumbers.add(x);
        }
        System.out.println(squareOfNumbers);

    }
}
/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */