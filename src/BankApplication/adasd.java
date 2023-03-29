package BankApplication;

import java.util.Scanner;

public class adasd {
    public static void main(String[] args) {
        var flag = false;
        Scanner scan = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("Enter a number!");
            if(scan.hasNextInt()){
                num = scan.nextInt();
                flag= true;
            }else {
                scan.nextLine();
                System.out.println("Sayi gir kardes");
            }
        }while(!flag);
    }
}
