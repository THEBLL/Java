package day33_encapsulation_inheritance;

public class C02_SatinAlma {

    public static void main(String[] args) {

        C01_pazarlama pazarlama=new C01_pazarlama();


        /*
          eger pazarlamadaki class uyeleri default access midifier'a sahip olursa
          hem deger atayabilirim, hem de sonuclari gorebilirim

          eger private yaparsam o zaman da hic bir sekilde erisilemez

        pazarlama.satis=200;
        System.out.println(pazarlama.satis);   // 200
        pazarlama.toplamSatis=500;
        System.out.println(pazarlama.toplamSatis);  // 500

        eger bir class uyesine,
        baska classlarin erisimini okuma(read / degeri gorme) ve yazma(write / deger atama) seklinde
        derecelendirmek istersek
        acces modifier ile yapamayiz


        /*
         eger bir class uyesine erisimi read ve write olarak ayirmak istersek
         ilk yapilacak sey
         access modifier ile erisimi engellemek
         */



        pazarlama.setSatis(100);
        pazarlama.setSatis(200);
        pazarlama.setSatis(400);
        pazarlama.setSatis(100);

        System.out.println(pazarlama.getToplamSatis());
    }
}
