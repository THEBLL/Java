package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C05_usHesaplama {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        //        While loop kullanarak verilen sayinin istenen ussunu hesaplayip
        //        yazdiran bir method olusturun.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ussunu hesaplayacagimiz pozitif bir sayi girin");
        double sayi = scanner.nextDouble();

        System.out.println("Lutfen hesaplanacak us icin pozitif bir tamsayi girin");
        int us= scanner.nextInt();

        double sonuc= 1;

        usHesaplama(sayi,us);


    }
    public static void usHesaplama(double sayi, int us){

        double sonuc= 1;

        while (us > 0 ){

            sonuc*=sayi;
            us--;
        }
        System.out.println("sonuc : "+sonuc);
    }
}
