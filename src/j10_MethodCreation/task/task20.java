package j10_MethodCreation.task;



public class task20 {
    public static void main(String[] args) {
        String values = "$1 $12 €34 €56 $45 €78";
        String value = values.replaceAll(" " , "");
        int dolars = 0, euros=0;

        for(int i=0; i<=values.length()-1; i++) {
            if(value.charAt(i) == '$') {
                dolars+=i;


            }
            }
        System.out.println(dolars);
        }


    }


 /*
    task->
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz

       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */