package day10_SwitchCase_StringManipulations;

import java.util.Scanner;

public class C01_SwitchStatements {
    public static void main(String[] args) {

        // kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        // ve girilen harfin karsiligini yazdirin
        // I : International
        // S : Software
        // T : Testing
        // Q : Qualifications
        // B : Board

        Scanner scanner=new Scanner(System.in);
        System.out.println("Anlamini ogrenmek istediginiz harfi giriniz\n" +
                "           I : International\n" +
                "           S : Software\n" +
                "           T : Testing\n" +
                "           Q : Qualifications\n" +
                "           B : Board");
        char harf=scanner.next().toUpperCase().charAt(0);

        switch (harf){
            case 'I' :
                System.out.println("International");
                break;
            case 'S' :
                System.out.println("Software");
                break;
            case 'T' :
                System.out.println("Testing");
                break;
            case 'Q' :
                System.out.println("Qualifications");
                break;
            case 'B' :
                System.out.println("Board");
                break;

            default:
                System.out.println("Hatali giris yaptiniz");

        }
    }
}
