package whileLoop;


import java.util.Scanner;

public class breakLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Agam bir metin giresen : ");
        String email = input.nextLine();

        int i =0;

        while(i<1) {
            if(email.contains("@")) {
                System.out.println(email.substring(0, email.indexOf("@")));
            }else
            System.out.println("lutfen duygun bir mail adresi giriniz:");
            break;

        }
    }
}
// Task: girilen mail hesabinda @ karakterine kadar olan kismi print ediniz: