package day21_arrays;

import java.util.Arrays;

public class C07_EnUzunEnKisaKelimeYazdir {
    public static void main(String[] args) {

        // verilen String bir array'deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun

        String[] isimler= {"Resul","Omer","Mehmet","Ertugrul"};

        enUzunEnKisaYazdir(isimler);

    }
    public static void enUzunEnKisaYazdir(String[] isimler){

        String enKisaKelime = isimler[0];  // sadece baslangic degeri olmasi icin atandi
        String enUzunKelime = isimler[0];  // sadece baslangic degeri olmasi icin atandi

        for (int i = 0; i <isimler.length ; i++) {

            if (isimler[i].length() > enUzunKelime.length()){
                enUzunKelime = isimler[i];
            }
            if (isimler[i].length() < enKisaKelime.length()){
                enKisaKelime = isimler[i];
            }
        }
        System.out.println("en uzun kelime : " + enUzunKelime);
        System.out.println("en kisa kelime : " + enKisaKelime);
    }
}
