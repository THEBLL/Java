package day30_immutableClasses;

import java.lang.management.LockInfo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class tekrar {
    public static void main(String[] args) {

        LocalTime time=LocalTime.of(15,20);
        LocalDate date=LocalDate.now();
        System.out.println(time+"\n"+date);

    }
}
