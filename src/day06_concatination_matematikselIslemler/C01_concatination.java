package day06_concatination_matematikselIslemler;

public class C01_concatination {
    public static void main(String[] args) {

        String s1="Java";
        String s2="Candir";
        String s3=" ";
        String s4="";
        int a=3;
        int b=5;

        // sadece yukaridaki variablleri kullanarak
        // asaida verilen metinleri yazdirin

        //Java 35
        System.out.println(s1+a+b); // Java35

        // Java15
        System.out.println(s1+ a*b); // Java15

        // 8Candir
        System.out.println((a+b)+s2); // 8Candir

        //53Java
        System.out.println(s4+b+a+s1); //53Java
        System.out.println(b + (a+s1)); // 53Java

        // 35Java
        System.out.println(s4+a+b+s1); // 35Java
        System.out.println(a+ (b+s1)); // 35Java


    }
}
