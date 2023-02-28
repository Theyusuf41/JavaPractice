package j16_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        System.out.println(now.getHour()+ " hour");
        System.out.println(now.getMinute()+ " minute");
        System.out.println(now.getSecond() +" second");

        // tanimlanan bir zaman diliminde minus() ve plus() ile hareket edebiliriz.

        LocalTime time1 = LocalTime.of(17,23,53);
        System.out.println(time1.plusHours(3).minusMinutes(83).plusSeconds(100));


    }
}
// LocalTime saat,dakika,saniye datalarini store ederiz.