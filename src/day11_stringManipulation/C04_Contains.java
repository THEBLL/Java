package day11_stringManipulation;

public class C04_Contains {
    public static void main(String[] args) {
        String str = "Java gun gectikce guzellesiyor";


        System.out.println(str.contains("Java")); // true

        // str java icerir mi ?
        System.out.println(str.contains("java")); // false

        // str a icerir mi ?
        System.out.println(str.contains("a")); // true

        // *** contains aranan metnin sayisiyla ilgilenmez
        // sadece VAR veya YOK sonucu dondurur


    }
}
