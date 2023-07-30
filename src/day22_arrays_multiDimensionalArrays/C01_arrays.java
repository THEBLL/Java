package day22_arrays_multiDimensionalArrays;

public class C01_arrays {
    public static void main(String[] args) {

        String[] isimler={"Ayse","Yusuf","Bugra","Abdullah","Nergiz"};

        // verilen bir arrayde'ki uzunlugu tek sayi olan isimleri
        // yan yana aralarinda bir bosluk birakarak yazdirin
        // en sonda alt satira gecerek toplam kac isim yazdirildigin i yazdirin


        int sayac=0;
        int kelimUzunlugu=0;

        for (int i = 0; i <isimler.length; i++) {

            kelimUzunlugu = isimler[i].length();

            if (kelimUzunlugu%2 != 0){
                System.out.print(isimler[i]+" ");
                sayac++;
            }
        }
        System.out.println("\nToplam "+sayac+" adet isim yazdirildi");
    }
}
