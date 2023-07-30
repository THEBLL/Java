package day21_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C06_BaskaClassdanMethodKullanma {
    public static void main(String[] args) {

        int[] arr={2,4,6,8};

        System.out.println("eski array : "+ Arrays.toString(arr));

        arr=C02_ArrayinElementleriniIStenenKadarArtirma.elementleriArtir(arr,4);

        System.out.println("yeni array : "+ Arrays.toString(arr));

        System.out.println(C03_PozitifElementleriTopla.pozitifElementleriTopla(arr)); // 36

        C04_ElementSay.elemanSay(arr,6);  // method void oldugu icin bizim sout yapmamiza gerek yok



        // kullanicidan deger alarak int[] olusturmak istiyorum

        int[] kullaniciArrayi= C05_ArrayOlustur.arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));

    }
}
