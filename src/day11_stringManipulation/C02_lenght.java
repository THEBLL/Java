package day11_stringManipulation;

import java.util.Scanner;

public class C02_lenght {
    public static void main(String[] args) {

        String isim="Ramazan Uzunkavaklaraltindayataruyumazoglu";

        // son harfi yazdirin
        System.out.println(isim.length()); // 42
        System.out.println("son harf : "+isim.charAt(isim.length() - 1)); // u

        // sondan 5. harfi yazdirin
        System.out.println(isim.charAt(isim.length() - 5)); // z

        // kullicidan ismini alin
        // ve ortadaki harfi yazdirin
        // ismin uzunlugu cift sayi ise orta kisimdaki 2 harfi yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("ismini girin");
        String girilenIsim= scanner.nextLine();

        int uzunluk=girilenIsim.length();

        if (uzunluk% 2==0){ // uzunluk ciftse

            System.out.println("uzunluk cift.ortadaki iki harf : " +
                               girilenIsim.charAt(uzunluk/2 -1)+
                               girilenIsim.charAt(uzunluk/2));

        }else { //uzunluk tekse
            System.out.println("uzunluk tek, ortadaki harf : " + girilenIsim.charAt((uzunluk-1)/2));
        }
    }
}
