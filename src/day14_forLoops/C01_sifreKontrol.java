package day14_forLoops;

import java.util.Scanner;

public class C01_sifreKontrol {

    public static void main(String[] args) {

        // kullanicidan bir sifre isteyin ,asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksiklari soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sifre giriniz");
        String sifre= scanner.next();

        boolean flag =true;

        if (! (sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk harf olmali");
            flag=false;
        }

        if (! (Character.isDigit(sifre.charAt(sifre.length()-1)))){
            System.out.println("son karakter rakam olmali");
            flag=false;
        }

        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            flag=false;
        }

        if (! (sifre.length()>=10)){
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag=false;
        }

        if (flag){
            System.out.println("sifre basariyla kaydedildi");
        }
    }
}
