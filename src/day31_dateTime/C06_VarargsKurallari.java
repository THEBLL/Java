package day31_dateTime;

public class C06_VarargsKurallari {
    public static void main(String[] args) {

        // kullanici kac tane argument verirse versin
        // ilk element haric diger elementleri toplayip
        // bulunan toplami ilk element ile carpip, sonucu yazdiran bir method olusturun

        islemYap(3,4,5);
        islemYap(2,3,4,5,2);

    }

    public static void islemYap(int ilkSayi, int... kalanlar) {

        int toplam=0;
        for (int eacSayi : kalanlar
             ) {
            toplam+=eacSayi;
        }

        int sonuc = ilkSayi * toplam;
        System.out.println("istenen islemin sonucu : " + sonuc);
    }

    /*
     Varargs sinirsiz element alabildiginden
     gelen her elemani alacaktir

     bu ozelliginden dolayi, varargs bir method'da parametre olarak kullanilacaksa
     SON PARAMETRE olarak yazilmak zorundadir

     bu kuralin dogal sonucu olarak bir method'da birden fazla varargs parametre olmaz
     */
}
