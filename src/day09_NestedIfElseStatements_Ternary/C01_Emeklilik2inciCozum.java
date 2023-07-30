package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C01_Emeklilik2inciCozum {
    public static void main(String[] args) {

        // kullanicidan cinsiyetini ve yasini alin,
        // kadin, 60 yas ve uzeri, erkek 65 yas ve uzeri emekli olabilir,
        // cinsiyet ve yasini dikkate alarak "emekli olabilirsin"
        // veya "Emekli olmak icin ... yil daha calisman gerekir" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz E : Erkek, K : Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Yasinizi giriniz");
        int yas = scanner.nextInt();

        if (yas < 10 || yas > 80) {
            System.out.println("gecersiz yas");
        } else if (yas < 60) { // kimse emekli olamaz

            if (cinsiyet=='K'){
                System.out.println("kadin emekli olabilmek icin "+ (60-yas) + " yil daha calismali");
            } else if (cinsiyet=='E') {
                System.out.println("erkek emekli olabilmek icin "+ (65-yas) + " yil daha calismali");
            }else {
                System.out.println("cinsiyet hatali");
            }
        } else if (yas < 65) { // sadece kadinlar emekli olabilir

            if (cinsiyet=='K'){
                System.out.println("kadin emekli olabilir");
            } else if (cinsiyet=='E') {
                System.out.println("erkek emekli olabilmek icin "+ (65-yas) + " yil daha calismali");
            }else {
                System.out.println("cinsiyet hatali");
            }
        } else { // herkes emekli ollabilir
            if (cinsiyet == 'K' || cinsiyet == 'E') {
                System.out.println("emekli olabilir");
            } else {
                System.out.println("cinsiyet hatali");
            }
        }
    }
}
