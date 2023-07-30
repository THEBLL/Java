package day12_StringManipulation;

public class C03_isEmpty_isBlank {
    public static void main(String[] args) {

        String str1="";
        String str2=" ";
        String str3="_";

        System.out.println(str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false

        System.out.println(str3.isBlank()); // true
        System.out.println(str2.isBlank()); // true

        System.out.println(str3.isEmpty()); // false
        System.out.println(str3.isBlank()); // false


    }
}
