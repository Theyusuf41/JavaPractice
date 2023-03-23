package extraExercies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class JIQ_10 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("John" ,"Ahmed", "Eric" , "Abddullah", "John" , "Yusuf" , "Kemal", "Ahmed"));
        /*String name = "Ahmed";
        for (int i = 0; i <names.size() ; i++) {
            if(name.equals(names.get(i))){
                names.remove(names.get(i));
            }
        }
        System.out.println(names); */

        // 2. yöntem
        Iterator itr = names.iterator();
        while(itr.hasNext()){
            if(itr.next().equals("Ahmed")){
                itr.remove();
            }
        }
        System.out.println(names);
    }
}
