package day14_forLoops;

import java.util.Scanner;

public class C07_StringTerstenYazdirma {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen tersten yazdirmak istediginiz metni giriniz");
        String metin= scanner.nextLine();

        // Java Candir

        for (int i = metin.length()-1; i >=0 ; i--) {

            System.out.println(metin.charAt(i));
        }
        System.out.println("");


        // ters cevrilmis halini kaydedelim
        String tersMetin="";

        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin += metin.charAt(i);
        }
        System.out.println("Ters cevrilen metin : " + tersMetin);
    }
}
