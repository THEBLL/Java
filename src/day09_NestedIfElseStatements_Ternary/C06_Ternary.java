package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        // kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();

        System.out.println(sayi1>sayi2 ? sayi2 :sayi1);
    }
}
