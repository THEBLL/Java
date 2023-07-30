package day04_dataCasting_WrapperClass;

public class C05_WrapperClasses {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(3)); // a

        int sayi = 20;

        /*
          Java primitive data turleri icin hazir method olusturamaz
          ancak
          primitive data turleri icin de hazir methodlar kullanabilecek
          Wrapper class'lar olusturmustur

          int ==> Integer
          char ==> Charcter

          short ==> Short
          double ==> Double ....

          Wrapper class'lar primitive data turleri ile hic problemsiz atama yapilabilir
         */

        int sayi2 = 5;

        Integer sayi3 = sayi2;
        int sayi4 = sayi3;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // Short sayi5 = (Short)sayi3; Wrapper class'lar arasinda casting olmaz

        System.out.println(Short.MIN_VALUE);

        // icinde sadece sayisal ifadeler bulunan bir String verildiginde
        // matematiksel islem yapmaniz gerekirse
        // Integer.parseInt() ile int'a cevirebiliriz

        String str1="22";
        String str2="33";

        //Bu degerleri toplayip yazdirin

        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));  // 55

        char ch1='7';
        System.out.println(Character.isLetterOrDigit(ch1)); // true
        System.out.println(Character.isDigit(ch1));  // true
        System.out.println(Character.isLetter(ch1)); // false



    }
}
