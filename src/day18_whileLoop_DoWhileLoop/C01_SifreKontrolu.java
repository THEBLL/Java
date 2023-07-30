package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C01_SifreKontrolu {

    public static void main(String[] args) {

        // main method'da kullanicidan bir sifre isteyin ,
        // olusturacagimiz bir method'da asagidaki sartlari kontrol edin
        // ve method'dan true veya false dondurun
        // ve kullaniciya duzeltmesi gereken tum eksiklari soyleyin,
        // tum sartlari saglanincaya kadar tekrar deger isteyin
        // ve sartlar saglaninca, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali


        /*
         bu soruyu day17'de cozduk
         ama java'da daha profesyonel kodlama icin
         iki duzeltme yapicaz

         while loop'un onundeki parantezin ici
         true oldugu muddetce loop calisir

         bu soruda sonuc variable'i boolean deger iceriyor
         ama sorunun mantigi acisindan
         sonuc false oldugu muddetce loop calismali

         2-  while loop her calistigin da
         Scanner scanner = new Scanner(System.in);
         calisiyor ve yeni bir obje olusturuyor

         bunun yerine daha guzel olani
         loop'dan once objeyi olusturup
         loop'un icerisin de sadece deger atamasi yapmaktir
         */

        boolean sonuc=false;
        Scanner scanner;
        String sifre;


        while (!sonuc){  // sonuc==false
            scanner  = new Scanner(System.in);
            System.out.println("lutfen bir sifre giriniz");
             sifre= scanner.nextLine();
            sonuc=sifreKontrolEt(sifre);
        }
        System.out.println("sifre basariyla kaydedildi");





    }

    public static boolean sifreKontrolEt(String sifre) {

        int sayac=0;

        if (! (sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk harf olmali");
            sayac++;
        }

        if (! (Character.isDigit(sifre.charAt(sifre.length()-1)))){
            System.out.println("son karakter rakam olmali");
            sayac++;
        }

        if ((sifre.contains(" "))){
            System.out.println("sifre bosluk icermemeli");
            sayac++;
        }

        if (! (sifre.length()>=10)){
            System.out.println("uzunlugu en az 10 karakter olmali");
            sayac++;
        }

        if (sayac==0){
            return true;

        }else {
            return false;
        }

    }
}
