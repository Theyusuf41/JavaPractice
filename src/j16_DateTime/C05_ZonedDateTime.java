package j16_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class C05_ZonedDateTime {
    public static void main(String[] args) {
        LocalDate useDate = LocalDate.now(ZoneId.of("America/New_York"));
        LocalTime useTime = LocalTime.now(ZoneId.of("America/New_York"));

        System.out.println(useDate + " Date ");
        System.out.println(useTime+ " time");

    }
}
// herhangi bir ülke veya sehir icin tarih-zaman datasini store eder