package day11_stringManipulation;

public class C06_starsWith_endsWith {
    public static void main(String[] args) {

        String str="Java cok guzel";

        // str Java ile mi basliyor?
        System.out.println(str.startsWith("Java")); // true

        // str "Java cok guzel" ile mi basliyor?
        System.out.println(str.startsWith("Java cok guzel")); // true

        System.out.println(str.startsWith("")); // true

        // 5.indexten sonrasi c ile mi baslar?
        System.out.println(str.startsWith("c",5)); // true

        // 6.indexten sonrasi ok ilemi baslar
        System.out.println(str.startsWith("ok",6)); // true


        // str guzel ile mi biter?
        System.out.println(str.endsWith("guzel")); // true

        // str el ile mi biter?
        System.out.println(str.endsWith("el"));  // true

        // str "" ile mi biter
        System.out.println(str.endsWith(""));  // true

        System.out.println(str.endsWith(" ")); // false


    }
}
