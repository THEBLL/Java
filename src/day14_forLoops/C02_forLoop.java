package day14_forLoops;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {
        // kullanicidan baslangic ve bitis degeri olarak pozitif sayilaar alin
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin
        // bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("baslangic degeri icin pozitif bir tamsayi giriniz");
        int baslangic= scanner.nextInt();

        System.out.println("lutfen bitis degeri icin pozitif bir tamsayi giriniz");
        int bitis= scanner.nextInt();

        if (bitis < baslangic){
            System.out.println("baslangic degeri bitis degerinden buyuk olamaz");
        }else {

            int toplam=0;

            for (int i = baslangic; i <=bitis ; i++) {

                toplam += i;
            }
            System.out.println("sinirlar arasindaki tamsayilarin toplami : " + toplam);
        }
    }

}
