package day14_forLoops;

import java.util.Scanner;

public class C05_RakamlarToplami {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");
        int sayi= scanner.nextInt();

        int birlerBasamagi=0;
        int toplam=0;
        int basamakSayisi=(sayi+"").length();


        for (int i = 1; i <=basamakSayisi ; i++) {

            birlerBasamagi=sayi%10;
            toplam=toplam+birlerBasamagi;
            sayi=sayi/10;
        }


        System.out.println("girilen sayinin rakamlar toplami : "+toplam);




    }
}
