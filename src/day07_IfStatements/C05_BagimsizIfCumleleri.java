package day07_IfStatements;

import java.util.Scanner;

public class C05_BagimsizIfCumleleri {
    public static void main(String[] args) {

        // soru 4- kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //         ucgen eskenar ise "Eskenar ucgen" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz");
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int kenar3 = scanner.nextInt();

        /*
          Java da 3'lu karsilastirma olmaz
          ikili karsilastirmalar yapip
          && veya || operatorleri ile birlestirmeliyiz
         */
        if (kenar1 == kenar2 && kenar2 == kenar3){
            System.out.println("Eskenar ucgen");
        }
    }
}
