package day12_StringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String str="Javayi ogrenecegiz, baska yolu yok";

        // a harfinin ilk kullanim index'ini yazdirin
        System.out.println(str.indexOf("a"));  // 1

        // a harfinin son kullaniminin index'ini yazdirin
        System.out.println(str.lastIndexOf("a")); // 24

        // J harfinin ilk index'ini yazdirin
        System.out.println(str.indexOf("J"));  // 0

        // J harfinin son kullaniminin index'ini yazdirin
        System.out.println(str.lastIndexOf("J"));  // 0

        // metne bakmadan e harfinin 2 kere veya daha fazla kullanilip kullanilmadigini yazdirin
        int ilkIndex=str.indexOf("e");
        int sonIndex=str.lastIndexOf("e");

        if (ilkIndex==-1){
            System.out.println("hic kullanilmamis");
        } else if (ilkIndex==sonIndex) {
            System.out.println("sadece bir e kullanilmis");
        }else {
            System.out.println("e harfi 2 kere veya daha fazla kullanilmis");
        }

        // o harfinin son index'ini yazdirin
        System.out.println(str.lastIndexOf("o")); // 32

        // o harfinin son kullanimindan bir onceki kullaniminin index'ini yazdirin
        System.out.println(str.lastIndexOf("o",31));  // 27

        // k harfinin son kullaniminin indexini yazdiralim

        System.out.println(str.lastIndexOf('k'));  // 33
    }
}
