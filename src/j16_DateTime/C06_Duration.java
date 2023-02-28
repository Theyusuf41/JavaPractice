package j16_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {
        LocalTime gece = LocalTime.of(00,23);
        LocalTime gunduz = LocalTime.of(13,17);

        Duration fark = Duration.between(gece,gunduz);
        Duration fark2 = Duration.between(gunduz,gece);
        System.out.println("fark2 " + fark2 );
        System.out.println("fark1 " + fark );

        System.out.println(fark.getSeconds());
    }
}
//