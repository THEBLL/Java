package day15_nestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C02_NestefForLoop {
    public static void main(String[] args) {
        /*
          kullanicidan 2 rakam alin
          ilk rakam satir
          ikinci rakam sutun olmak uzere asagidaki sekli cizdirin

          * * * * *
          * * * * *
          * * * * *
          * * * * *

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("olusturulacak seklin satir sayisini giriniz");
        int satir=scanner.nextInt();

        System.out.println("olusturulacak seklin sutun sayisini giriniz");
        int sutun= scanner.nextInt();


        for (int i = 1; i <=satir; i++) {  // satirlari kontrol eder

            for (int j = 1; j <=sutun ; j++) {  // sutunlari kontrol eder

                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
