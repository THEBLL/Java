package day30_immutableClasses;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        System.out.println(time);  // 10:55:42.626138300

        System.out.println(time.getHour());

        System.out.println(time.getMinute());

        System.out.println(time.minusMinutes(1000));

        System.out.println(time.minusMinutes(100));

        System.out.println(time.plusSeconds(100000));

        System.out.println(time.withHour(15));  // saati istedigin gibi ayarlayabilir

        System.out.println(time.withMinute(15));  // dakikayi istedigin gibi yapar

        System.out.println(time.withSecond(0).withSecond(0));  // 11.02

        LocalTime time1 = LocalTime.of(12,35);
        LocalTime time2 = LocalTime.of(14,34);

        System.out.println(time1.isBefore(time2));  // true

        System.out.println(time1.isAfter(time2));  // false

    }
}
