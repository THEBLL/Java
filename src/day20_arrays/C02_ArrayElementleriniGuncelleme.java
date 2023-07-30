package day20_arrays;

import java.util.Arrays;

public class C02_ArrayElementleriniGuncelleme {

    public static void main(String[] args) {

        int[] sayilar = new int[6];  // [0, 0, 0, 0, 0, 0]

        System.out.println(Arrays.toString(sayilar));

        // 2.indexteki elementi 5 yapin
        sayilar[2] = 5;
        System.out.println(Arrays.toString(sayilar));  // [0, 0, 5, 0, 0, 0]


        // 2.indexteki sayiyi 7 yapin
        sayilar[2] = 7;
        System.out.println(Arrays.toString(sayilar));  // [0, 0, 7, 0, 0, 0]


        // index kullanmada bir elemente atama yapmak mumkun degildir

        // 5.index'deki elementi 8 yapin
        sayilar[5] = 8;
        System.out.println(Arrays.toString(sayilar));  // [0, 0, 7, 0, 0, 8]

        // 6.index'e yeni bir element ekleyelim
        sayilar[6] = 20;  // .ArrayIndexOutOfBoundsException
        // buna Run Time Error denilir  (bunda mantik hatasi degil deger hatasi var)


        /*
          uzunlugu verilen bir array'de
          var olan elementler index ile update edilebilir
          ANCAK
          yeni element ekleyip uzunlugunu degistirmek isterseniz
          RunTimeError olusur
         */









    }
}
