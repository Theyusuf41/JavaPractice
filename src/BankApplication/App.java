package BankApplication;


import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Customer customer1 = new Customer("tugba", "123456789", "tugba41", 400);

        while(true) {
            System.out.println("Hesap numarasini giriniz: ");
            String hesapInput = scanner.nextLine();
            if(hesapInput.equals(customer1.accountNumber)){
                System.out.println("Sifrenizi  giriniz: ");
                String sifre = scanner.nextLine();
                if(sifre.equals(customer1.password)){
                    System.out.println("Hosgeldiniz: " + customer1.name );
                    break;
                }else System.out.println("Yanlis girdiniz");
            }else System.out.println("Yanlis girdiniz");
        }
        anaMenu();
        int islem = scanner.nextInt();

        switch (islem) {
            case 1:
               bakiyeYazdir(customer1);
                break;
            case 2:
                customer1.addBalance();
                break;
            case 3:
                customer1.withdrawMoney();
                break;
            case 4:
                customer1.chancePassword();
                break;
            case 5:

                break;
        }
    }

    public static void bakiyeYazdir(Customer customer1) {
        customer1.printInfo();
    }

    public static void anaMenu() {
        System.out.println("\n 1-Bakiye yazdir \n 2-Para yatir \n 3-Para cek \n 4-Bilgileri degistir \n 5-Cikis yap");
    }
    //Kullaniciya hesap numarasi ve sifresi sorularak kontrol saglanir. Dogruysa sisteme giris yapilir.
//Yanlissa sisteme dogru bilgi girilene kadar soru tekrarlanir.

//Kullanici giris yaptiktan sonra ana menude birtakim seceneklerle karsilasir.
// 1 - Bakiye yazdir
// 2 - Para yatir
// 3 - Para cek
// 4 - Bilgileri degistir
// 5 - Cikis yap

// Her islem sonunda kullaniciya baska bir islem yapmak isteyip istemedigi sorulacak.
// Evet denirse menu tekrardan yazdirilarak ana menuye gidilecek
// Hayir denir ise sistemden cikis yapilacak
}
