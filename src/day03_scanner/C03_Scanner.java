package day03_scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir double, bir de int sayi alip
        //         bunlarin toplamini ve carpimini yazdirin.


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir double sayi giriniz");

        double girilenDouble = scan.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz");

        int girilenInt = scan.nextInt();

        System.out.println("Iki sayinin toplami : " + (girilenInt + girilenDouble));
        System.out.println("Iki sayinin carpimi : " + girilenDouble*girilenInt);
    }
}
