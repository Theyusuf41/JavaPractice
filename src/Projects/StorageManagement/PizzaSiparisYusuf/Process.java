package Projects.StorageManagement.PizzaSiparisYusuf;

import java.util.ArrayList;
import java.util.Scanner;

public class Process implements  Process1 {


    static Scanner sc = new Scanner(System.in);
    static ArrayList<Pizza> list1 = new ArrayList<>();
    static ArrayList<Process> list2 = new ArrayList<>();

    public static void girispaneli() {
        System.out.println("**********HOSGELDINIZ*****************");
        System.out.println("Istediginiz boyutu giriniz,Small  1,Medium ->2,Large ->3");
        int option = sc.nextInt();
        switch (option) {// TODO TRY CATCH
            case 1:
                PizzaShape.options(option);
                panel();
                break;
            case 2:
                PizzaShape.options(option);
                panel();
                break;
            case 3:
                PizzaShape.options(option);
                panel();
                break;
            default:
                System.out.println("gecerli bisey gir");


        }
    }

    public static void panel() {
        Process pc = new Process();
        System.out.println("istediginiz islemi giriniz liste->1,add->2,delet->3");
        int i = sc.nextInt();

        switch (i) {
            case 1:
                pc.list();
                break;
            case 2:
                pc.add();
                break;
            case 3:
                pc.delete();
                break;
            default:
                System.out.println("gecerli bisey gir");

        }
    }

    @Override
    public void list() {
        System.out.println(Process.list1);
        panel();

    }

    @Override
    public void add() {

        System.out.println("Istediginiz fiyati giriniz,size giriniz,sosis,chicken,veg,mix");
        Pizza piz = new Pizza(new Scanner(System.in).nextInt(), new Scanner(System.in).
                nextInt(), new Scanner(System.in).nextBoolean(),
                new Scanner(System.in).nextBoolean(), new Scanner(System.in).nextBoolean(),
                new Scanner(System.in).nextBoolean(), new Scanner(System.in).nextBoolean());
        Process.list1.add(piz);
        panel();


    }

    @Override
    public void delete() {

    }

}