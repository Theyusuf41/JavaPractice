package j10_MethodCreation.task;

import java.util.Scanner;

public class task18 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        triangleCalc();

    }

    private static void triangleCalc() {
        System.out.println("Bitte geben Sie ein Nummer ein;");
        int num1 = input.nextInt();
        System.out.println("Bitte geben Sie ein Nummer ein;");
        int num2 = input.nextInt();
        System.out.println("Bitte geben Sie ein Nummer ein;");
        int num3 = input.nextInt();

        while(true) {
            if((num1*num1) + (num2*num2) == (num3*num3)) {
                System.out.println("Dik Ucgendir");
            }else if((num1*num1) + (num3*num3) == (num2*num2)){
                System.out.println("Dik Ucgendir");
            }else if((num3*num3) + (num2*num2) == (num1*num1)) {
                System.out.println("Dik Ucgendir");
            }else System.out.println("Yanlis seyler girdin ....");
            break;
        }

    }

    /*public static int calculationOfEdges(int num1,int num2,int num3) {
        if(((num1<num2) && (num1<num3)) && ((num2>num1) && (num2<num3))) {
            if((num1*num1) + (num2*num2) == (num3*num3)) {
                System.out.println("Dik Ucgendir");
            }else System.out.println("Dik Ucgen degildir");
        }else if(((num2<num1) && (num2<num3)) && ((num1>num2) && (num1<num3))) {
            if((num1*num1) + (num2*num2) == (num3*num3)) {
                System.out.println("Dik Ucgendir");
            }else System.out.println("Dik Ucgen degildir");
        }else if(((num3<num1) && (num3<num2)) && ((num2>num1) && (num3<num1))) {
            if((num1*num1) + (num2*num2) == (num3*num3)) {
                System.out.println("Dik Ucgendir");
            }else System.out.println("Dik Ucgen degildir");
    }
    public static int calculationOfEdges(int num1,int num2,int num3) {
        while(true) {
            if((num1*num1) + (num2*num2) == (num3*num3)) {
                System.out.println("Dik Ucgendir");
            }else if((num1*num1) + (num3*num3) == (num2*num2)){
                System.out.println("Dik Ucgendir");
            }else if((num3*num3) + (num2*num2) == (num1*num1)) {
                System.out.println("Dik Ucgendir");
            }else System.out.println("Yanlis seyler girdin tatlis....");
            break;
        }
        return calculationOfEdges();
    }*/

}
/* task-> girilen üç tamsaynın
        bir dik üçgenin kenar uzunlukları olamsını kontrol eden METHOD create ediniz.
        (Trick->: a b c kenarları için  a2+b2=c2 pisagor  şartı sağlanmalı)

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
         dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        dik üçgen değildir.*/