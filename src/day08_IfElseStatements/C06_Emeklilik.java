package day08_IfElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
        // kullanicidan cinsiyetini ve yasini alin,
        // kadin, 60 yas ve uzeri, erkek 65 yas ve uzeri emekli olabilir,
        // cinsiyet ve yasini dikkate alarak "emekli olabilirsin"
        // veya "Emekli olmak icin ... yil daha calisman gerekir" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz E : Erkek, K : Kadin");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);

        System.out.println("Yasinizi giriniz");
        int yas=scanner.nextInt();

        if (cinsiyet == 'E' && yas>=65){
            System.out.println("Erkek emekli olabilir");
        } else if (cinsiyet =='E' && yas<65) {
            System.out.println("Erkek emekli olamaz "+ (65-yas) +" yil daha calismalisin");
        } else if (cinsiyet == 'K' && yas>=60) {
            System.out.println("Kadin emekli olabilir");
        }else if (cinsiyet == 'K' && yas<60){
            System.out.println("Kadin emekli olamaz "+ (60-yas) +" yil daha calismalisin");
        }
    }
}
