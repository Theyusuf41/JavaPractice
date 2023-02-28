package j16_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getYear());
        System.out.println(today.getDayOfYear());

        LocalDate date = LocalDate.of(2016,3,23);
        LocalDate date2 = LocalDate.of(2014, Month.MAY,19);

        System.out.println(date.plusDays(45));
        System.out.println(date2.minusWeeks(33));
    }
}
// LocalDate sadece gun-ay-yil datalarini store eder.