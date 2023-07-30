package day24_arrayList;

import java.util.*;

public class C02_List {
    public static void main(String[] args){

        // bir list olusturmak icin
        // <> icerisine data turu yazilmalidir
        // data truu PRIMITIVE data turleri olamaz

       // List<String> isimler = new List abstract oldugu icin bu sekilde yazilmaz

        List<String> isimler=new ArrayList<>();
        ArrayList<String> isimler2=new ArrayList<>();
        // ikinci yazim bicimi cok kullanilmaz

        // her list olusturuldugunda bos olarak olusturulur
        // sonra elementler tek tek eklenir

        System.out.println(isimler);  // []
        isimler.add("Burhan");
        isimler.add("Seref");
        isimler.add("Gulsah");

        System.out.println(isimler);  // [Burhan, Seref, Gulsah]
        // elementler ekleme sirasina gore dizilir

        // eger en sona degil de istedigimiz bir index'e element eklemek istersek
        isimler.add(2,"Nergiz");
        System.out.println(isimler);  // [Burhan, Seref, Nergiz, Gulsah]

        isimler.add(1,"Omer");
        System.out.println(isimler);  // [Burhan, Omer, Seref, Nergiz, Gulsah]

        isimler.addAll(2,isimler);
        System.out.println(isimler);  // [Burhan, Omer, Burhan, Omer, Seref, Nergiz, Gulsah, Seref, Nergiz, Gulsah]

        System.out.println(isimler.add("Eyup")); // false
        System.out.println(isimler);  // [Burhan, Omer, Burhan, Omer, Seref, Nergiz, Gulsah, Seref, Nergiz, Gulsah, Eyup]

        System.out.println(isimler.add("Gulsah"));  // true
        System.out.println(isimler);



    }
}
