package day06_concatination_matematikselIslemler;

public class C02_karsilastirmaOperatorleri {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        // Java'da = isareti karsilastirma degil, atama isaretidir (assigment)
        b = 2*a;

        // Java da esitligi kullanmak istersek == kulaniriz

        System.out.println(b == 2*a); // true

        // assignment esitligin sol tarafinda sadece variable bulunu
        //sol taraf matematiksel islem olmaz
        // karsilastirma operatorlerinde iki tarafta fa islem olabilir
        System.out.println(3*b > 5*a); // true

        System.out.println(b>=b-a); // true

        // Java da karsilastirma operatorlerinde kullanilan
        // boolean degeri tersine cevirir

        System.out.println(a < b); // true
        System.out.println( ! (a < b)); // false
        System.out.println(a != b); // true




    }
}
