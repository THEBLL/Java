package day32_stringBuilder_accessModifier;

public class C03_StringBuilder_StringMethodleri {

    public static void main(String[] args) {

        String str = "Java Candir";

        StringBuilder sb1 = new StringBuilder();
        // sb1 = str;
        // Non-primitive data turlerinde farkli data turleri arasinda atama yapabilmek icin
        // bu iki non-primitive data turu arasinda Parent-Child iliskisi olmalidir

        sb1 = new StringBuilder(str); // bu sekilde atama yapilabilir

        System.out.println(sb1);  // Java Candir

        System.out.println(sb1.substring(0, 4));  //  Java
        System.out.println(sb1);  // Java Candir

        // sb1 J harfi iceriyormu
        System.out.println(sb1.toString().contains("J"));  // // true

        // StringBuilder'da olmayip, String'de olan methodlari kullanmak istersek
        // StringBuilder.toString() ile String'e gecis yapabiliriz
        // bu durumda calisan methodlarin sb'i kalici olarak degistirmeyeceklerini UNUTMAMALIYIIZ



    }
}
