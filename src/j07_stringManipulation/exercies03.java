package j07_stringManipulation;

public class exercies03 {
    public static void main(String[] args) {
        String iphone = "$1500";
        String iphone1 = iphone.replaceAll("\\D" , "");
        int newIphone = Integer.valueOf(iphone1);


        String ipad = "$1200";
        String ipad1 = ipad.replaceAll("\\D" , "");
        int newIpad = Integer.valueOf(ipad1);

        System.out.println(newIphone + newIpad + "$");


    }
}
