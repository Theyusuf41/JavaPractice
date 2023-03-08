package j13_ArrayList.task;

import java.util.ArrayList;
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> notes = new ArrayList<>();
        ArrayList<Integer> students = new ArrayList<>();

        while(true) {
            System.out.println("Not giriniz:\n0 girince cikicaksiniz:");
            int x = scanner.nextInt();
            notes.add(x);
            if(x==0) break;
        }
        System.out.println("Girilen notlar: " + notes);
        findAverage(notes,students);

    }

    public static void findAverage(ArrayList<Integer> notes, ArrayList<Integer> students) {
        int sum = 0;
        for (int x:notes) {
            sum+=x;
        }// toplam not bulundu.
        System.out.println("Toplam notlar: " + sum + "\nortalama ise: " + (sum / (notes.size()-1)));
        for(int i=0; i< notes.size(); i++) {
            if(notes.get(i) >= (sum/ notes.size()-1)){
                students.add(notes.get(i));
            }
        }
        System.out.println("Ortalamayi su kadar ogrenci gecebildi: "+ students.size());

    }


}


          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
