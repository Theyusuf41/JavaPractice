package extraExercies.Hakan;

public class JIQ_01 {
    public static void main(String[] args) {
        String str1 = "AAABBBCCC";
        duplicates(str1);


    }

    private static void duplicates(String str1) {
        String singleLetters = " ";
        for (int i = 0; i <str1.length() ; i++) {
            if(!singleLetters.contains(str1.substring(i , i+1))){
                singleLetters+=str1.substring(i , i+1);
            }
        }
        System.out.println(singleLetters);
    }
}
