package day12_StringManipulation;

public class C04_nullPointer {
    public static void main(String[] args) {

        String str1;


        str1 = "java";

        System.out.println(str1);  // java
        System.out.println(str1.concat(" candir")); // java candir

        /*
          null bir deger degil pointer(isaretleyici)


          str2'ye deger atamadik bunun, farkindayiz ve null olarak isaretledik
         */

        String str2=null;
        System.out.println(str2); // null
        System.out.println(str2 + " candir"); // null candir

        // System.out.println(str2.concat(" candir"));  // NullPointerException

        str2="tava";
        System.out.println(str2.concat(" candir"));

        String str3 = null;
        String str4 = "";

        System.out.println(str4.isBlank());  // true
        System.out.println(str4.isEmpty());  // true

        System.out.println(str3.isBlank());  // NullPointerException
        System.out.println(str4.isEmpty());  // NullPointerException



    }
}
