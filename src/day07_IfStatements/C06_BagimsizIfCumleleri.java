package day07_IfStatements;

import java.util.Scanner;

public class C06_BagimsizIfCumleleri {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi isteyin
        // sayi 3 veya 5 ile bolunebiliyorsa
        // "Guzel sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 3==0 || sayi % 5==0) System.out.println("Guzel sayi");
    }
}
