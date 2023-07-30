package day17_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C07_whileLoop {

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


        boolean sonuc=false;

        while (sonuc==false){
            Scanner scanner = new Scanner(System.in);
            System.out.println("lutfen bir sifre giriniz");
            String sifre= scanner.nextLine();
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
