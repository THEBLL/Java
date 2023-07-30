package day07_IfStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        // kullanicidan notunu isteyin
        // 50 ve uzeri ise sinifi gectin
        // degilse maalesef kaldin yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        double not = scanner.nextDouble();

        if (not >= 50) {
            System.out.println("Sinifi gectiniz");
        }else {
            System.out.println("Maalesef kaldiniz");
        }

        /*
         eger bir sart icin sadece 2 durum soz konusu ise
         iki durumu ayri ayri kontrol etmek yerine
         tek bir kontrol ile de yapabiliriz

         Bagimsiz if cumlelerinden farkli olarak
         if else  cumlelerinde
         ya if body'si, ya else body'si calisir

         IKISININ BIRDEN calismasi mumkun olmadigi gibi,
         IKISININ DE CALISMASI mumkun degildir
         */
    }
}
