package Day01;

public class Q12_PerfectNumber {
    // Bir sayiyi bolen sayilarin toplami ona esitse bu bir mukemmel sayidir. ORnek sayilar --> 6,28,496,8128
    public static void main(String[] args) {
        int number = 6;
        int sum =0;
        for (int i = 1; i < number; i++) {
            if(number%i==0) sum+=i;

        }
        System.out.println((sum == number) ? " Bu bir mukommel sayidir" : " Muko degildir");
    }
}
