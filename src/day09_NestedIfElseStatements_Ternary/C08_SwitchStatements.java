package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C08_SwitchStatements {
    public static void main(String[] args) {

        // kullanicidan ay numarasini alip ay ismini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("yazdirmak istediginiz ay kacinci ay");
        int ayNo= scanner.nextInt();

        switch (ayNo){
            case 1 :
                System.out.println("ocak");
                break;
            case 2 :
                System.out.println("subat");
                break;
            case 3 :
                System.out.println("mart");
                break;
            case 4 :
                System.out.println("nisan");
                break;
            case 5 :
                System.out.println("mayis");
                break;
            case 6 :
                System.out.println("haziran");
                break;
            default:
            System.out.println("ay no yanlis");
        }
    }
}
