package day16_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C03_MethodOlusturma {

    //Soru 2- Kullanicidan main method icinde  ayri ayri isim ve soyismini alin

    //        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    //        isim bosluk soyisim seklinde bize donduren bir method olusturun
    //        input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("isminizi giriniz lutfen");
        String isim= scanner.next();

        System.out.println("soyisminizi giriniz lutfen");
        String soyIsim= scanner.next();

        System.out.println(isimDuzenle(isim, soyIsim)); // istersek direk dondurdugu snucu yazdirabilir

        String duzenliIsim = isimDuzenle(isim, soyIsim);  // istersek de ilerde kullanmak uzere kaydedebiliriz

    }
    public static String isimDuzenle(String isim, String soyIsim){

        isim = isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
        soyIsim = soyIsim.substring(0,1).toUpperCase() + soyIsim.substring(1).toLowerCase();


        String istenenFormattaIsimSoyisim= isim+" "+soyIsim;

        return istenenFormattaIsimSoyisim;

    }
}
