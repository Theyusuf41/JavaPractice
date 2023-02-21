package j08_loops;

public class task27 {
    public static void main(String[] args) {
        for(int i=1; i<4; i++) {
            for(int it=1; it<4; it++) {
                System.out.print("IT :" +  i );
                System.out.println("QA :" + it );
            }
            System.out.println();

        }
    }
}
  /* Ex-1: Asagidaki ciktiyi verecek kodu yaziniz
            1.
                        IT: 1
                          QA: 1
                          QA: 2
                          QA: 3
                          .....
                        IT: 2
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
                        IT: 3
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
         */