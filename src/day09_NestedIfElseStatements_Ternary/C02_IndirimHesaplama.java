package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C02_IndirimHesaplama {
    public static void main(String[] args) {
        // kullanicidan aldigi urun adedi ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun
        // musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapi,
        // musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scanner=new Scanner(System.in);

        System.out.println("aldiginiz urun adedini girin");
        int urunadedi= scanner.nextInt();

        System.out.println("lutfen liste fiyatini giriniz");
        double listefyt= scanner.nextDouble();

        System.out.println("musteri kartiniz varsa E, musteri kartiniz yoksa Y tiklayin");
        char kart=scanner.next().toUpperCase().charAt(0);

        // ana degisken kart varmi bilgisi olsun

        if (kart == 'E'){ // karti olanlar
           // musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapi,
            if (urunadedi>10){
                System.out.println("%20 indirimli toplam fiyat "+ urunadedi*listefyt*80/100);
            } else {
                System.out.println("%15 indirimli toplam fiyat "+ urunadedi*listefyt*85/100);
            }

        } else if (kart == 'Y') { // karti olmayanlar
            if (urunadedi>10) {
                System.out.println("%15 indirimli toplam fiyat " + urunadedi * listefyt * 85 / 100);
            }else {
                System.out.println("%10 indirimli toplam fiyat "+ urunadedi*listefyt*90/100);
            }
        }else { // hatali kart bilgisi
            System.out.println("kart bilgisi hatali");
        }
    }
}
