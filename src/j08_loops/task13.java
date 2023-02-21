package j08_loops;

public class task13 {
    public static void main(String[] args) {
        String str = "ABCDEF";

        for(int i= str.charAt(0); i<str.length()-1; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();


    }
}
/*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..
        */