package day17_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C02_TamBolenlerSayisiniBulma {
    public static void main(String[] args) {

        // kullanicidan main method icinde bir tamsayi alin
        // girilen sayinin pozitif tam bolenleri sayisini bulup
       // bize donduren bir method olusturun
        // ornek : 20 pozitif tam bolenlei : 1,2,4,5,10,20 : 6

        Scanner scanner=new Scanner(System.in);
        System.out.println("pozitif btam bolenleri sayisini bulmak istediginiz sayiyi giriniz");
        int sayi=scanner.nextInt();

        System.out.println(tamBolenlerSayisi(sayi));
    }
    public static int tamBolenlerSayisi(int sayi){

        int sayac=0;

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){
                sayac++;
            }
        }
        System.out.print("tam bolenler sayisi : ");
        return sayac;
    }
}
