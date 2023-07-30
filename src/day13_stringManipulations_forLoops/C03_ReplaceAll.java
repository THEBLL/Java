package day13_stringManipulations_forLoops;

import java.util.Scanner;

public class C03_ReplaceAll {
    public static void main(String[] args) {
        // kullanicidan bir metin isteyin
        // metindeki tum sayilari ve space disindaki ozel karakterleri temizleyin
        // ornek input : J1*2av4.a C67/an=+dir--_
        //       outpu : Java Candir.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen istediginiz bir metni giriniz");
        String metin= scanner.nextLine();

        // once sayilardan kurtulalim
        metin = metin.replaceAll("\\d","");

        // ozel karakterlden kurtulmak istedigimiz de, space de kaybolur
        // bunun icin once space'i korumaya almaliyiz
        // artik metnimizde sayi yok, onun icin space yerine herhangi bir sayiyi atayalim
        metin = metin.replaceAll("\\s","1");

        // ozel karakterlerden kurtulalim
        metin = metin.replaceAll("\\W","");

        // space yerine atadigimiz 1'i yeniden space yapalim
        metin = metin.replaceAll("1"," ");

        metin = metin.replaceAll("_","");

        metin = metin+".";

        System.out.println(metin);
    }
}
