package j18_ImmutableClass;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_ImmutableClass {
    public static void main(String[] args) {
        String name = "Yusuf";
        System.out.println("method oncesi name " + name );
        name.concat("QA team leader");

        System.out.println("method sonrasi name " + name ); // String immutable degismez.

        System.out.println("****mutable class ornegi****");
        ArrayList<String> nameList = new ArrayList<>();
        System.out.println("method oncesi name " +nameList);
        nameList.add("Yusuf");
        nameList.add("Ali");
        System.out.println("method sonrasi name " +nameList);

    }
}
// Boolean, Short , Integer , Double ve String immutable classlara ornektir.
// StringBuilder, StringBuffer, Arrays ve ArrayList Mutable classlardir.