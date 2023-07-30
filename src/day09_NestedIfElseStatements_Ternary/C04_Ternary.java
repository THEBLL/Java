package day09_NestedIfElseStatements_Ternary;

public class C04_Ternary {
    public static void main(String[] args) {

        // input olarak verilen bir sayinin 3 ile tam bolunup bolunmedigini bulun

        int input=14;

       // System.out.println(input % 3==0 ? "3 ile tam bolunuyor" : "3 ile tam bolunmuyor");

        String sonuc = input % 3==0 ? "3 ile tam bolunuyor" : "3 ile tam bolunmuyor";

        System.out.println(sonuc);

        // verilen input cift sayi ise "cift sayi",
        // input tek sayi ise 2 * input sonucunu veren bir ternary yazin

       System.out.println(input % 2 == 0 ? "cift sayi" : 2 * input);


       //  int sonuc2=input % 2 == 0 ? "cift sayi" : 2 * input;
        /*
          eger ternary de true durumu ile false durumu
          bize farkli data turunde sonuclar donduruyorsa
         sonucu bir variable'a atayamayiz

         ama direk yazdirabiliriz
         */
    }
}
