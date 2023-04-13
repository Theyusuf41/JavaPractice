package Day01;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();  //1634
        int temp = sayi;
        int toplam = 0;
        int basamaksayisi = (String.valueOf(sayi).length()); //4

        while(sayi>0){
            int basamak = sayi%10;
            toplam +=Math.pow(basamak,basamaksayisi);
            sayi/=10;
        }
        if (toplam == temp){
            System.out.println("Amstrong");
        }else{
            System.out.println("Not Amstrong");
        }
    }
    }

