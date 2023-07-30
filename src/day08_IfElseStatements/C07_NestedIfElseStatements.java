package day08_IfElseStatements;

import java.util.Scanner;

public class C07_NestedIfElseStatements {
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


        /*
          birden fazla degisken varsa
          ickerinden birini birincil degisken olarak alip
          sadece ona gore bir if - else if - else kuralim
         */

        if (cinsiyet == 'E'){

            if (yas<0 || yas>100) {
                System.out.println("gecersiz yas girildi");
            } else if (yas>=65) {
                System.out.println("Erkek emekli olabilir");
            }else {
                System.out.println("Erkek emekli olabilmek icin "+ (65-yas) +" yil daha calismali");
            }

        } else if (cinsiyet == 'K') {

            if (yas<0 || yas>100) {
                System.out.println("gecersiz yas girildi");
            } else if (yas>=60) {
                System.out.println("Kadin emekli olabilir");
            }else {
                System.out.println("Kadin emekli olabilmek icin "+ (60-yas) +" yil daha calismali");
            }
        }else {
            System.out.println("Cinsiyet hatali girildi");
        }
    }
}
