package day11_stringManipulation;

public class C07_indexOf {
    public static void main(String[] args) {

        String str="Ali topu at, at ali at";

        // Ali'nin index'i nedir? 0
        System.out.println(str.indexOf("Ali"));  // 0

        // at'in index'i nedir?
        System.out.println(str.indexOf("at"));  // 9

        // op'un index'i nedir?
        System.out.println(str.indexOf("op"));  // 5

        System.out.println(str.indexOf('a'));  // a

        System.out.println(str.indexOf("a", 10)); // 13

        System.out.println(str.indexOf("yusuf"));  // -1


    }
}
