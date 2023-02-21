package whileLoop;

public class task04 {
    public static void main(String[] args) {
        int i = 999;

        while(i>=100) {
            if(i%4==0 && i%6==0) {
                System.out.println(i);
            }
            i--;
        }

    }
}
/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */