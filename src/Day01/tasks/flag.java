package Day01.tasks;

public class flag {
    public static void main(String[] args) {

        int sayi = 10;
        var flag = true;

        while(flag){
            System.out.println(sayi); // 10
            sayi--;
            if(sayi == 0) {
                flag= false;
            }
            System.out.println(sayi);
        }
    }
}
