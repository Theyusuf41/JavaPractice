package whileLoop;

public class task2131 {
    public static void main(String[] args) {
        String str = "qwertzqweqweqweqeqwqwe";


        if(!str.contains(" ") && Character.isLowerCase(str.charAt(0)) && !Character.isDigit(str.charAt(str.length()-1)) && str.length()>=10 ) {
                System.out.println("Passcode is true");
        }else System.out.println("Passcode is false");



    }
}
