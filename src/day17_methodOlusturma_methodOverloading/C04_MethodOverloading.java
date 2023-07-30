package day17_methodOlusturma_methodOverloading;

public class C04_MethodOverloading {

    /*
      bir bir method call yaptigimizda
      java oncelikle method ismini kkontrol eder
      sonra argument olarak verilen degerler ile,
      parametre olarak yazilan variable'larin data turlerini karsilastirir
      ve uyumlu ise method'u caöistirir
      argumentler ile parametreler uyumlu degilse CTE verir

      java da ayni data turune ve parametre sayisina sahip
      birden fazla method olusturamazsiniz

      farkli data turlerinde parametreler varsa
      dizilis degistirildiginde
      java farkli bir method olarak kabul eder
     */

    public static void main(String[] args) {

        toplama(4,6);
        toplama(5.3,6);
        toplama(5,2.4);
        toplama(4.3,2.4);


        toplama(3.4f,5);

        toplama(2.3f,5f);  // iki doubl'in toplami : 7.299999952316284



    }
    public static void toplama(int sayi1, int sayi2){

        System.out.println("iki int'in toplami : "+(sayi1+sayi2));

    }

    public static void toplama(int a, double b){

        System.out.println("int ile double'in toplami : "+(a+b));
    }

    public static void toplama(double b, int a){
        System.out.println("double ve int'in toplami : "+(a+b));
    }

    public static void toplama(double sayi1,double sayi2){

        System.out.println("iki doubl'in toplami : "+(sayi1+sayi2));
    }

    /*
      method ismi + parametrelerin data turlerine method signature denir
      Java ayni class'da signature'i ayni olan 2 method'a izin vermez

      Bir class'da ismi ayni fakat signature'i farkli
      birden fazla mezhod olusturmasina METHOD OVERLOADING denir
     */
}
