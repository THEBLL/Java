package day07_IfStatements;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {
        // soru 1- kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise "Eskenar ucgen" yazdirin
        // degilse "Eskenar degil" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin 3 kenar uzunlugunu giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar2>0) {
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar ucgen degil");
        }
    }
}
