package j22_Encapsulation.encapsulation01.task02;


import java.util.Scanner;

public class task02Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad giriniz: ");
        String name= scanner.nextLine();
        System.out.println("Yas giriniz: ");
        int yas = scanner.nextInt();
        Task02 person1 = new Task02(name, yas);
        System.out.println(person1);

    }
}
