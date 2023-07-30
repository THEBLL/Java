package day10_SwitchCase_StringManipulations;

public class C05_equals {
    public static void main(String[] args) {

        String str1 = "Mehmet";
        String str2 = "MEHMET";
        String str3 = "mehmet";
        String str4 = "MEhmet";

        System.out.println(str1 == str2);  // false
        System.out.println(str3 == str4.toLowerCase()); // mehmet == mehmet false
        System.out.println(str2 == str3.toUpperCase()); // MEHMET == MEHMET false

        /*
          String'lerde == bekledigimiz sonuclari DONMEYEBILIR
          bunun sebebi String class'ini olustururken yapilan bazi ozelliklerdir
          bu konu ilerde detayli bir sekilde anlatilacak

          verilen iki String'in metinsel olarak ayni olup olmadigini
          kontrol etmek icin == yerine equals() kullanilir

          equals()'u bire bir ayni olan iki metin icin true
          farkli metinler icin false sonucu uretir(dondurur)
          bu karsilastirmada metnin ayni olmasi yaninda
          buyuk kucuk harf durumu da kontrol eder (case sensitive)

          EGER case sensitive olmadan metinleri karsilastirmak istersek
          equalsIgnoreCase()'u kullanilir
         */

        System.out.println(str1.equals(str2)); // Mehmet -- MEHMET false
        System.out.println(str3.equals(str4.toLowerCase())); // mehmet -- mehmet true
        System.out.println(str2.equals(str3.toUpperCase())); // mehmet -- mehmet true

        System.out.println(str1.equalsIgnoreCase(str2));   // true
        System.out.println(str1.equalsIgnoreCase(str3));  // true
        System.out.println(str3.equalsIgnoreCase(str4));  // true

    }
}
