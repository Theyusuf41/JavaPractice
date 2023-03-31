package extraExercies.Mevlut;

import java.util.Arrays;
import java.util.TreeSet;

public class JIQ_04 {
    public static void main(String[] args) {
        // Duplicate onune gecmek icin TreeSet veya Lampda kullanilabilir
        String s1 = "qwertzu";
        String s2 = "asdfghj";
        String s3 = "asdfghj";
        String s4 = "asdnmbj";

        System.out.println(treeSetDuplicate(s1, s2)+ " treeSet ile yapilan islem");
        System.out.println(allMatch(s3,s4) + " stream ile yapilan islem");
    }

    private static boolean allMatch(String s3, String s4) {
        return Arrays.stream(s4.split("")).allMatch(a -> s3.contains(a));
    }

    private static boolean treeSetDuplicate(String s1, String s2) {
        String t1 = new TreeSet<>(Arrays.asList(s1.split(""))).toString();
        String t2 = new TreeSet<>(Arrays.asList(s2.split(""))).toString();
        return t1.equals(t2);
    }
}
