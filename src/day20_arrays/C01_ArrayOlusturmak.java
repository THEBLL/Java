package day20_arrays;

import java.util.Arrays;

public class C01_ArrayOlusturmak {

    public static void main(String[] args) {

        int[] sayilar = {2,4,6,7,8};

        String harfler[] = {"a","f","e"};

        System.out.println(sayilar[1]);  // 4
        System.out.println(harfler[2]);  // e


        String[] ogrenciListe = {"Burhan","Ramazan","Samet","Senil"};

        System.out.println(ogrenciListe[1]);  // Ramazan

        // 5 kisilik bir sinif olusturun
        String[] sinifListesi1={null,null,null,null,null};

        String[] sinifListesi2 = new String[5];



        /*
          bir array olusturulurken 2 sey mutlaka belirtilmeli
          1- icine konulacak datalarin turu
          2- Array'in uzunlugu  (Bir array'e uolustururken yazilan uzunlugundan
             daha fazla element konulamaz)
         */


        // bir array'in tumunu nasil yazdirabiliriz

        System.out.println(sayilar);  // [I@49e4cb85

        // dongu ile yazdiralim
        for (int i = 0; i <sayilar.length ; i++) {

            System.out.print(sayilar[i]+" ");
        }  // 2 4 6 7 8
        System.out.println("");

        // Array'in tamamini yazdirmak isterseniz
        // Arrays class'indan hazir method kullaniriz
        System.out.println(Arrays.toString(sayilar));  //

        System.out.println(Arrays.toString(harfler));  // [a, f, e]

        // for loop ile elementleri yazdiririz
        // Arrys.toString() ise bize array'in kendisini yazdirir

        System.out.println(Arrays.toString(sinifListesi1));  // [null, null, null, null, null]
        System.out.println(Arrays.toString(sinifListesi2));  // [null, null, null, null, null]

        int[] notlar = new int[4];
        System.out.println(Arrays.toString(notlar));  // [0, 0, 0, 0]

        boolean[] bllist= new boolean[8];
        System.out.println(Arrays.toString(bllist));  // [false, false, false, false, false, false, false, false]




    }
}
