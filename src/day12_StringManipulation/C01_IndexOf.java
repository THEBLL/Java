package day12_StringManipulation;

public class C01_IndexOf {
    public static void main(String[] args) {

        String str = "Ali topu at, topu at ali";


        // ilk top metin parcasinin index'ini yazdirin
        System.out.println(str.indexOf("top")); // 4

        // ikinci top metin parcasinin index'ini yazdirin
        System.out.println(str.indexOf("top",5));  // 13
        System.out.println(str.indexOf("top",str.indexOf("top")+1));  // 13

        // at kelimesinin 2 kere kullanip kullanilmadigini metne bakmadan bulunuz

        int ilkIndex=str.indexOf("at"); // ya -1 veya dogal sayi olur

        if (ilkIndex == -1){
            System.out.println("2 kere kullanilmamis");
        }else {
            System.out.println("en az bir kere kullanilmis");
        }

        int ikinciIndex= str.indexOf("at",ilkIndex+1);
        // -1 veya 2.defa kullanilmissa  dogal sayi olabilir
        if (ikinciIndex == -1){
            System.out.println("2 kere kullanilmamis");
        }else {
            System.out.println("2 defa veya daha fazla kullanilmis");
        }

    }
}
