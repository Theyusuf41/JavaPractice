package j34_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_InsideSout { // Task -> Verilen listteki elemanlari cift olma durumlarina gore filter et ve karelerini al
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(7,3,11,4,12,1,5,17,2));
        makeSquare(l1);
        sum(l1);
        multiple(l1);
        enKucuk(l1);

    }

    public static void sum(List<Integer> l1) {
        System.out.println(
                l1.stream()
                        //.reduce(Math::addExact)
                        //.reduce(Integer::sum())
                        .reduce(0, (x,y) -> x+y)// veya bunu Integer.sum veya Math.addExact ile de yapabiliriz


        );
    }

    public static void makeSquare(List<Integer> l1) {
        // Trick -> Ciktisini almak istedigimiz degerleri direkt olarak Sout icine yazabiliriz.
        System.out.println(
                l1.stream()
                        .filter(t -> t %2 ==0)
                        .map(t -> Math.pow(t,2))
                        .reduce(Math::max)
        );
    }
    public static void multiple(List<Integer> l1) {
        System.out.println(
                l1.stream()
                        .filter(t -> t %2 ==0)
                        .reduce(1, Math::multiplyExact)
                        //.reduce(1, (x,y) -> (x*y) ) amele kod vardir burada
        );
    }
    public static void enKucuk(List<Integer> l1) {
        System.out.println(
                l1.stream()
                        .reduce(Integer.MAX_VALUE, (x,y) -> x<y? x:y) // ilk deger olarak IntegerMax aldik ve ternary ile karsilastirdik
                        //.reduce(Integer::min) 2.yontem
                       //.reduce(Math::min)  1.yontem
        );
    }
}
/*
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
        kullanımı yaygındır pratiktir.
        Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
        bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
        reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
        reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

        */