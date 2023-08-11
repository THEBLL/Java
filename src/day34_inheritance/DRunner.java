package day34_inheritance;

public class DRunner {

    public static void main(String[] args) {

        Corolla corolla=new Corolla();

        // Corolla class'indaki ozellikler
        System.out.println(corolla.uretimYeri); // C Sakarya/ Türkiye
        System.out.println(corolla.model);  //  Corolla
        System.out.println(corolla.aku);  //  Inci aku
        System.out.println(corolla.sanziman);  // Cvt

        // Toyota class'indaki ozellikler
        System.out.println(corolla.marka);  // Toyota
        System.out.println(corolla.lastik);  // tüm Toyota araclar pirelli lastik kullanir
        System.out.println(corolla.guvenlik);  // tüm Toyota araclar extra guvenlik icerir
        System.out.println(corolla.fren);  // Toyota araclar abs fren sistemi kullanir

        // Araba class'indan aldigi ozellikler
        System.out.println(corolla.yakit);  // yakit turu belirtilmedi
        corolla.yakit="Benzi";
        System.out.println(corolla.yakit);  // Benzin
        System.out.println(corolla.yil);  // 1900
        System.out.println(corolla.renk);  // renk belirtilmedi

    }
}
