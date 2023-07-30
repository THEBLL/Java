package day26_forEachLoop_constructor;

import java.sql.ClientInfoStatus;
import java.util.*;

public class C05_Runner {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Set<Integer> ogrenciListesi = new HashSet<>();
        String str = new String("Java Candir");

                    C04              obje    =              new       C04();
        // class adi / data turu    isim   atama isareti  keyword   constructor


        System.out.println(obje.hiz); // 0
        System.out.println(obje.kapasite); // 0
        System.out.println(obje.ogrenciIsmi); // null
        System.out.println(obje.sayi); // 10
        obje.method1(); // method1 calisti


    }
    /*
     herhangi bir class'in icinden
     baska bir class'daki class uyelerine ( variable, method )
     ulasmak isterseniz
     hedef classtan bir obje olusturabiliriz

     Java'da bir class'dan obje olusturmak istediginizde
     MUTLAKA bir constructor calisir

     Java da objeler classlardan uretilir
     class'larda uretilebilmesi icin CONSTRUCTOR olmalidir
     Java bunu bildigi icin, olusturulan her class'a
     obje olusturulmasini saglayan DEFAULT CONSTRUCTOR yerlestirir

     default constructor GORUNMEZ
     parametresizdir ve body'sinde kod yoktur.

     ONEMLI :
     bir class'da gorunur bir constructor yoksa
     o class'da default constructor vardir
     gorunur bir constructor varsa
     Java default constructor'i siler










     default kelimesi birlikte kullanildigi kelime ile anlam kazanir
     default deger : class level'da olusturulan variable'lara
                     biz deger atamazsak, java default degerler atar
     default case    : switch statement'da hic bir case uyumlu olmayan
                     degerler icin tanimlanan kodlardir
     default access modifier : icinde bulunulan class ve icinde bulunulan package'da
                               erisilebilen class uyelerini belirler
     default constructor
     */
}
