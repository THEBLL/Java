package day04_dataCasting_WrapperClass;

import java.util.Scanner;

public class C04_CharCasting {
    public static void main(String[] args) {

        // kullanicidan bir char isteyin
        // girilen char'dan sonraki 3 karakteri yazdirin
        // Orn : input : a output b,c,d

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char girilenKrk=scan.next().charAt(0);

        // scanner.nextChar() methodu olmadigindan
        // once .next() ile String olarak alip, sonra o String'in ilk karakterini alalim

        System.out.println("girilen karakter : "+girilenKrk);

        System.out.println("girilen karakterden sonraki uc harf : " +
                    (char) (girilenKrk+1) + ", "+
                    (char) (girilenKrk+2) + ", "+
                    (char) (girilenKrk+3));

    }
}
