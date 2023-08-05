package day31_dateTime;

import java.time.LocalDateTime;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat);  // 2023-08-05 T 16:30:05.671816

        // bir forLoop olusturup, 1'den 10000'e kadar olan sayyilari toplayin
        // islem suresini nono saniya olarak yazdiralim

        LocalDateTime baslamaZamani = LocalDateTime.now();
        int baslangicZamani = baslamaZamani.getNano();

        int toplam=0;
        for (int i = 1; i <1000000 ; i++) {

            toplam += i;
        }

        LocalDateTime bitirmeZamani = LocalDateTime.now();
        int bitisZamani = bitirmeZamani.getNano();

        System.out.println("Islem suresi : " + (bitisZamani - baslangicZamani));
    }
}
