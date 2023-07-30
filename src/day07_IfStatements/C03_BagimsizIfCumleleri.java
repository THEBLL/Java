package day07_IfStatements;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri {
    public static void main(String[] args) {
        // soru 1- kullanicidan bir pozitif tamsayi isteyin
        //         sayiyi kontrol edip 5 ile bolunebiliyorsa "sayi 5'in tam kati" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir pozitif tamsayi giriniz");
        int sayi= scanner.nextInt();

        if (sayi % 5 == 0) System.out.println("sayinin 5 kati : " + sayi*5);

    }
}
