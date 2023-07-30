package day13_stringManipulations_forLoops;

public class C02_ReplaceAll {
    public static void main(String[] args) {

        String str="1Ja4va 8C9a2n5d1i1r.";

        // sayilarin tamamindan kurtulmak istersek
        //replace() yeterli olmaz

        // Java da sayilar, ozel karakterler, yada alfabetik karakterlerin
        // tumuyle islem yapmak isterseniz
        //replaceAll(istenenGrup,yeniDeger)

        str=str.replaceAll("\\w", "");
        System.out.println(str);

        /*
          \\s : space     \\S : space olmayan hersey
          \\s+ : yanyana birden fazla space
          \\d : digits    \\D : digit olmayan hersey
          \\w : harf, rakam veya _  \\W : harf veya rakam olmayan hersey

         */






        }
}
