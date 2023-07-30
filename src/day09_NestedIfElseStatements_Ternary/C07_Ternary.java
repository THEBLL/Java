package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {
        // kullanicidan bir sayi alin ve mutlaka degerini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi1= scanner.nextInt();

        System.out.println(sayi1>0 ? sayi1 : -1*sayi1);
    }
}
