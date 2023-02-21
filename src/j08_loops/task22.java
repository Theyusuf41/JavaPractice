package j08_loops;

public class task22 {
    public static void main(String[] args) {
        for(int i=99; i>0; i--) {
            System.out.print((i % 3 == 0 && i%2!=0) ? i +" Tek sayidir" : "");
        }
    }
}
/* task-> 100'den 0'a kadar bütün tek sayıları print eden code create ediniz.
        99-98-97-96....
        100 ve 0 dahil değildir.*/