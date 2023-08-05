package day31_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        // Kullanicinin verdigi dogum tarihine gore
        // kullanicinin yasini yil ve ay olarak yazdiran bir program hazirlayin

        LocalDate dogumTarihi = LocalDate.of(1997,2,14);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun));  // P26Y5M22D

        System.out.println(Period.between(dogumTarihi, bugun).getYears());  // 26

    }
}
