package day16_methodOlusturmaVeKullanma;

public class C04_BaskaClassdanMethodKullanimi {

    public static void main(String[] args) {

        C01_MethodOlusturma_kullanma.altString("Method",1,3);

        C03_MethodOlusturma.isimDuzenle("bilal", "doganay");

        System.out.println(C03_MethodOlusturma.isimDuzenle("bilal", "doganay"));

        String isimDuzenli = C03_MethodOlusturma.isimDuzenle("mehmet","kemal");
        System.out.println(isimDuzenli);

        // duzenlenmis ismin uzunlugunu yazdirin
        System.out.println(isimDuzenli.length());

        /*
          void olan method'da sonucu kKAYDEDEMEYIZ, sadece yazdiririz

          bize deger DONDUREN method'da ise sonucu
          istersek direk yazdirir, istersek de kaydederiz
         */
    }
}
