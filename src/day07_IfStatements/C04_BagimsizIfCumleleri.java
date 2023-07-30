package day07_IfStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri {
    public static void main(String[] args) {

        // soru 3- kullanicidan bir tamsayi alin
        //         sayi 3 ile bolunuyorsa "Uc ile bolunebilen sayi"
        //         5 ile bolunebiliyorsa "Bes ile bolunebilen sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int girilenSayi= scanner.nextInt();

        if (girilenSayi % 3==0) System.out.println("Uc ile bolunebilen sayi");
        if (girilenSayi % 5==0) System.out.println("Bes ile bolunebilen sayi");
    }
}
