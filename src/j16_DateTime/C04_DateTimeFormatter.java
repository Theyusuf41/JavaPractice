package j16_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-YY");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("YY:MM:dd");

        System.out.println(dtf.format(ldt));
        System.out.println(dtf2.format(ldt));

    }
}
