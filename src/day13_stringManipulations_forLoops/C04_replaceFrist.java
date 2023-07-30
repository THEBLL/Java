package day13_stringManipulations_forLoops;

public class C04_replaceFrist {
    public static void main(String[] args) {

        String str = "java Candir, kendisini cok seviyoruz123.";

        // sadece ilk a'yi BUYUK A yapin

        System.out.println(str.replaceFirst("a","A"));  //  jAva Candir

        // ilk space'i iki space haline getirin

        System.out.println(str.replaceFirst(" ", "  "));  // java  Candir, kendisini cok seviyoruz123.

        // ilk sayiyi space haline donusturun

        System.out.println(str.replaceFirst("\\d", " "));  // java Candir, kendisini cok seviyoruz 23.

        // ilk ozel karakteri * olarak degistirin

        System.out.println(str.replaceFirst("\\W","*"));  // java*Candir, kendisini cok seviyoruz123.


    }
}
