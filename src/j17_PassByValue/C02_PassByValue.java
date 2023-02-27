package j17_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {
        double preise = 100;
        decreasedPreise11(preise);
        decreasedPreise22(preise);
        decreasedPreise33(preise);

    }

    private static void decreasedPreise11(double preise) {
        preise*=0.89;
        System.out.println(preise + " %11 indirimli");
    }
    private static void decreasedPreise22(double preise) {
        preise*=0.78;
        System.out.println(preise + " %22 indirimli");
    }
    private static void decreasedPreise33(double preise) {
        preise*=0.67;
        System.out.println(preise + " %33 indirimli");
    }


}
// task-> verilen fiyati %11 %22 ve %33 indirimli halini return eden method create ediniz.