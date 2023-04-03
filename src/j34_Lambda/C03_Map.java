package j34_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Map {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(7,3,11,4,12,1,5,17,2));
        lambdaFunction(l1);
        System.out.println("\n****** *****");
        lambdaFunction1(l1);

    }

    //task01-> cift elemanlarin karelerini ayni satira bosluk birakarak print ediniz.
    public static void lambdaFunction(List<Integer>l1) {
        l1.stream()
                .filter(t -> t%2==0)
                .map(t-> t*t).forEach(C01_LambdaExpression::printOut);
    }

    //task02-> tek elemanlarin küpleri +1  ayni satira bosluk birakarak print ediniz.

    public static void lambdaFunction1(List<Integer>l1) {
        l1.stream()
                .filter(t -> t%2==1)
                .map(t-> (int)Math.pow(t,3)+1).forEach(C01_LambdaExpression::printOut);
    }
}
