package extraExercies.Mevlut;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JIQ_03 {
    public static void main(String[] args) {
        String s = "tayfa";
        var empty = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            empty+=s.charAt(i);
        }
        System.out.println(empty);
        reverse(s);
        var n = 10;
        sumWithLampda(n);

    }

    // Bu ornekte for dongusu ile sayilari toplamak yerine boyle birsey yaptik ve fazlasiyla mantikli
    private static void sumWithLampda(int n) {
        System.out.println(IntStream.range(0,n).reduce(0, (x,y) -> x+y));
    }

    private static void reverse(String s) {
        System.out.println(Arrays.stream(s.split("")).reduce("" , (x,y) -> y+x));
    }
}
// BU derste Lampda kullanarak Taskler cozuldu