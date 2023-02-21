package whileLoop;

import java.util.Scanner;

public class breakLoop04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("gakgom hele biseyler  giresen ha :");
        String str = input.nextLine();
        int count = 0 , i=0;
        while(i<str.length()) {
            if(str.charAt(i)== 'a') {
                count++;
            }else if(str.charAt(i)== 'c'){
                break;
            }
            System.out.println("Toplam karakter sayisi :" + count + "\n");
        }

    }
    }

// task -> girilen bir ifadedeki c karakterine kadar a karakter sayısını print eden code create ediniz.
/*
int aSayisi = 0;

        for (int i = 0; i < biSey.length(); i++) {

            if (biSey.charAt(i) == 'a') {//döngüdeki biSey karakterlerinin 'a' olma şartı
                aSayisi++;
            } else if (biSey.charAt(i) == 'c') {//döngüdeki biSey karakterlerinin 'c' olma şartı
                break;
            }
            System.out.println("loopdaki kontrole giren karakterler : " + biSey.charAt(i));
        }
        System.out.println();
        System.out.println("Gakgom giridgin biSeydeki a sayisi :" + aSayisi + " kadar ");
 */