package j15_Varargs;

public class C02_Varargs_Array {
    public static void main(String[] args) {
        int arr[] = {31,21,33,44,58,46,2,1,79};
        calcSum(arr);
        System.out.println(calcSumVararg(arr));

    }

    private static int calcSumVararg(int...arr) {
        int toplam=0;
        for (int a: arr) {
            toplam+=a;
        }

        return toplam;
    }

    private static void calcSum(int[] arr) {
        int sum=0;
        for (int x: arr) {
            sum+=x;
        }
        System.out.println("toplam deger " + sum);
    }
}
// Task01-> toplamlarini hesaplayan method create ediniz.
// Task01-> toplamlarini hesaplayan method VArarg kullanarak create ediniz.