package day17_methodOlusturma_methodOverloading;

import day16_methodOlusturmaVeKullanma.C01_MethodOlusturma_kullanma;
import day16_methodOlusturmaVeKullanma.C03_MethodOlusturma;

public class C03_BaskaClassdanMethodKullanma {
    public static void main(String[] args) {

        C01_MethodOlusturma_kullanma.altString("Method budur...",7,8);

        System.out.println(C03_MethodOlusturma.isimDuzenle("bilal", "doganay"));


        System.out.println(C01_AsalSayiBulma.asalSayiMi(59));  // true

        System.out.println(C02_TamBolenlerSayisiniBulma.tamBolenlerSayisi(12));


    }
}
