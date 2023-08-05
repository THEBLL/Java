package day31_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih1 = LocalDate.now();
        System.out.println(tarih1);

        System.out.println(tarih1.getMonth());  // AUGUST
        System.out.println(tarih1.getMonthValue());  // 8
        System.out.println(tarih1.getDayOfYear());  // 217

        System.out.println(tarih1.isLeapYear());  // false

        LocalDate tarih2 = LocalDate.of(2016,1,1);
        System.out.println(tarih2.isLeapYear());  // true

        System.out.println(tarih1.isAfter(tarih2));  // true

        System.out.println(tarih1.withYear(2022));

        System.out.println(tarih1.minusYears(3).minusDays(53));

        System.out.println(tarih1.plusWeeks(15).plusDays(3));

        System.out.println(tarih1.lengthOfYear());  // 365
        System.out.println(tarih1.lengthOfMonth());  // 31

    }
}
