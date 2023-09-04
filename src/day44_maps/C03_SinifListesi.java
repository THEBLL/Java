package day44_maps;

import java.util.Map;

public class C03_SinifListesi {

    public static void main(String[] args) {
        // ogrenci map'de sinif ve sube verdigimizde
        // o sinifta bulunan ogrenci isim ve soyisimlerini yazdirin
        /*
    1-tum value'leri bir Collection olarak kaydedelim
        2-bir for-each loop ile herbir value'yu ele alalim
        3-value'lar belirli bir ayrac ile birlestirilen Stringlerden olusturuldugu icin
          bu ayrac kullanilarak split() ile bir array'e donusturulebilir
        4-artik bir bir array ve icerisinde value'yu olusturan bilgiler mevcut
          istenen bilgiyi, array'den index ile alabiliriz
     */

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        MethodDeposu.sinifSubedekiOgrenciListesiYazdir(ogrenciMap,11,"h");

    }
}
