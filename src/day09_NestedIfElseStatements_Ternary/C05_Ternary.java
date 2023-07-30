package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

        // kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise "Eskenar ucgen" yazdirin,
        // degilse "Eskenar degil" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("ucgenin 3 kenar uzunlugunu giriniz");
        int kenar1= scanner.nextInt();
        int kenar2= scanner.nextInt();
        int kenar3= scanner.nextInt();

        System.out.println(kenar1 == kenar2 && kenar1 == kenar3 && kenar1>0
                           ?
                           "Eskenar ucgen"
                           :
                           "Eskenar degil");
    }
}
