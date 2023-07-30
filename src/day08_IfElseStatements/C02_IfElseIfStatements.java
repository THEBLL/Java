package day08_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {

        // kullanicidan bir tamsayi isteyin
        // sayi 3'e bolunuyorsa 3'un kati
        // sayi 5'e bolunuyorsa 5'in kati
        // ikisine birden bolunuyorsa super sayi
        // ikisine de bolunmuyorsa yaramaz sayi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println("super sayi");
        } else if (sayi % 5 == 0) {
            System.out.println("girilen sayi 5'in kati");
        } else if (sayi % 3 == 0 ) {
            System.out.println("girilen sayi 3'un kati");
        } else {
            System.out.println("yaramaz sayi");
        }
    }

}
