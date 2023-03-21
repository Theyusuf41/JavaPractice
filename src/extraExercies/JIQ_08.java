package extraExercies;

public class JIQ_08 {
    public static void main(String[] args) {
        String uc = "FIN";
        String bes = "RA";
        int num = 1;

        while(num<31){
            if(num%15==0){
                System.out.println(uc+bes);
            }else if(num%5==0){
                System.out.println(bes);
            }else if(num%3==0){
                System.out.println(uc);
            }else System.out.println(num);
            num++;
        }




    }
}
// 1-30 numbers / 3 bolunuyorsa "FIN" 5 bolunuyorsa "RA" eger ikisine de bolunuyorsa "FINRA" yazdir