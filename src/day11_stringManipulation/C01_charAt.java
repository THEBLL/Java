package day11_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {

        String str = "Java Candir";

        // ilk harfini yazdirin
        System.out.println(str.charAt(0));

        // 7. harfi yazdirin
        System.out.println(str.charAt(6)); // a

        // bu metnin uzunlugu
        System.out.println(str.length()); // 11

        // sondan 3. harfi yazdirin
        System.out.println(str.charAt(11-3)); // d

        // eger sondan basa dogru gelecek sekilde bir char isteniyorsa
        // charAt(uzunluk - sondanKacinciKarakter)

        // metnin uzunlugundan daha buyuk bir siradaki karakter istenirse
        // 20.karakteri yazdirin

        // System.out.println(str.charAt(20)); StringIndexOutOfBoundsException

        // 4.harfi buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase().charAt(3));  // A

        /*
          charAt()'u bize char data turunde bir sonuc verir (dondurur)
          toUpperCase() gibi methodlar String variable'lar ile calistigindan
          charAt() calistiktan sonra String Manipulations YAPILAMAZ
          eger manipulation ihtiyaci varsa, charAt() kullanmadan once yapilmalidir
         */
    }
}
