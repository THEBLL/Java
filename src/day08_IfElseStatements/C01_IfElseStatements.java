package day08_IfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        // soru 4- kullanicidan bir karakter girmesini isteyin,
        //         girilen karakterin buyuk harf olup olmadigini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char karakter = scanner.next().charAt(0);

        if (karakter >= 'A' && karakter <= 'Z') {
            System.out.println("girilen karakter buyuk harf");
        } else {
            System.out.println("girilen karakter kucuk harf");
        }
    }
}
