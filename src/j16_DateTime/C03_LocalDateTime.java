package j16_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDate date= LocalDate.of(2019,8,27);
        LocalTime time = LocalTime.of(12,23,44);

        LocalDateTime ldt1 = LocalDateTime.of(date, time);
        System.out.println(ldt1 + " ldt1");

    }
}
// LocalDateTime yil ay yil saat ve dakikayi datalarini store eder.